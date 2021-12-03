package com.liviu.lab_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyCalculator extends Frame {

    private final int height = 450;
    private final int width = 750;
    private final int buttonOffsetX = 20;
    private final int buttonOffsetY = 40;
    //The buttons area will have 70% of the window height and 5 rows.
    private final int buttonHeight = (int)(height*.7-buttonOffsetY)/5;
    private final int buttonWidth = (int)(width*.7)/4;
    private static TextArea displayArea, historyArea;
    private static final String emptyHistoryMessage = "No history yet";
    private static final String parenthesesErrorMessage = "Unbalanced parentheses \n";
    private final String[] buttonLabels = {"(",")","C","Back","7","8","9","/","4","5","6","*","1","2","3","+","0",".","=","-"};

    public MyCalculator() {
        super("Calculator");
        setUpFrame();
        setUpButtons();
    }

    private void setUpFrame() {

        this.setLayout(null);
        this.setBounds(400, 200, width, height);
        this.setResizable(false);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        displayArea = new TextArea("0", 8, 52, 3);
        displayArea.setBounds(buttonOffsetX, buttonOffsetY, (int) (width * 0.7), (int) (height * 0.3));
        displayArea.setEditable(false);
        displayArea.setBackground(new Color(230, 230, 230));
        this.add(displayArea);

        historyArea = new TextArea(emptyHistoryMessage, 52, 52, 3);
        int left = buttonOffsetX + (int) (width * 0.7);
        historyArea.setBounds(left, buttonOffsetY, width - left, height - buttonOffsetY);
        historyArea.setEditable(false);
        historyArea.setBackground(new Color(230, 230, 230));

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(width - 120, height - 40, 90, 25);
        clearButton.setBackground(new Color(255, 255, 255));
        clearButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        clearButton.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                historyArea.setText(emptyHistoryMessage);
            }
        });
        this.add(clearButton);
        this.add(historyArea);
    }

    private void setUpButtons(){

        for(int i = 0;i<buttonLabels.length;i++){
            addButton(buttonLabels[i],buttonOffsetX+buttonWidth*(i%4),5+buttonOffsetY + (int)(height*.3)+buttonHeight*(int)(Math.floor(i/4)));
        }
    }

    private void addButton(String label, int x, int y){

        final Button button = new Button(label);
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button.setBounds(x,y,buttonWidth-5,buttonHeight-5);
        this.add(button);
        button.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                if(displayArea.getText().equals("0"))displayArea.setText("");
                Button btn = (Button)e.getSource();
                String value = btn.getLabel();
                String displayText = displayArea.getText();
                int displayTextLength = displayText.length();
                //Instead of writing multiple Action Listeners, i just wrote a conditional one which depends on the button label.
                switch (value){
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        if(displayTextLength==0){
                            displayText=value;
                        }
                        //If the last character is an operator (ASCII decimal value between 42 and 47)
                        //then override this character, if not then append the operand at the end of the expression.
                        else if(displayText.charAt(displayTextLength-1)<=47 && displayText.charAt(displayTextLength-1)>=42){
                            displayText=displayText.substring(0,displayTextLength-1)+value;
                        }
                        else displayText+=value;
                        displayArea.setText(displayText);
                        break;
                    case "C":
                        displayArea.setText("0");
                        break;
                    case "=":
                        String record = displayText+"="+getResult(displayText)+"\n";
                        handleHistoryTextChange(record);
                        break;
                    case "Back":
                        if(displayTextLength>1)displayArea.setText(displayText.substring(0,displayTextLength-1));
                        else displayArea.setText("0");
                        break;

                        default:

                        displayArea.append(value);
                }
            }
        });
    }

    public static double getResult(String text){

        while(text.contains("(")&&text.contains(")")){
            int startIndex = 0, endIndex;
            for(int i = 0;i<text.length();i++){
                if(text.charAt(i)=='(')startIndex = i;
                //The loop overrides the starting index each time a opening parentheses is found but stops when
                //encountering the first closing parentheses which means that we start by evaluating first the more nested expressions in parenthesis.
                else if(text.charAt(i)==')'){
                    endIndex = i;
                    //Pass the expression inside the parentheses
                    String solvedBracket = solveExpression(text.substring(startIndex+1,endIndex));
                    //Replaces the part of the expression inside the parentheses with the result.
                    text = new StringBuilder(text).replace(startIndex,endIndex+1,solvedBracket).toString();
                    //Checks if the expression contains an invalid format of parentheses at any point
                    if(text.contains("(")^text.contains(")")){
                        handleHistoryTextChange(parenthesesErrorMessage);
                        throw new RuntimeException(parenthesesErrorMessage);
                    }
                    break;
                }
            }
        }
        return Double.parseDouble(solveExpression(text));
    }

    private static void handleHistoryTextChange(String newMessage){
        if(historyArea.getText().equals(emptyHistoryMessage)){
            historyArea.setText(newMessage);
        }
        else historyArea.append(newMessage);
    }

    //The function calls in a cascade the basic operations in the order of their priority,
    //this way division is done first, multiplication second and so on.
    private static String solveExpression(String text){

        double answer = Subtract(text);
        return String.valueOf(answer);
    }

    private static double Subtract(String text){

        //Split only when the sign "-" is preceded by a digit, otherwise keep it as a negative number.
        String[] operands = text.split("(?<=[\\d])-");
        double total = Add(operands[0]);
        for(int i = 1;i<operands.length;i++){
            total-=Add(operands[i]);
        }

        return total;
    }

    private static double Add(String text){

        double total = 0;
        String[] operands = text.split("\\+");
        for (String operand : operands) {
            total += Multiply(operand);
        }
        return total;
    }

    private static double Multiply(String text){

        double total = 1;
        String[] operands = text.split("\\*");
        for (String operand : operands) {
            total *= Divide(operand);
        }
        return total;
    }

    private static double Divide(String text){

        String[] operands = text.split("/");
        try{
        double total = Double.parseDouble(operands[0]);
        for(int i = 1;i<operands.length;i++){
            total/= Double.parseDouble(operands[i]);
        }
        return total;
        }catch (NumberFormatException e){
            //Show the error in the history area
            handleHistoryTextChange(e.getMessage());
            throw e;
        }
    }

    public static void main(String[] args) {
        new MyCalculator();
    }
}
