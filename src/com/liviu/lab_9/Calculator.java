package com.liviu.lab_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator extends Frame {

    TextField firstOperand;
    TextField secondOperand;
    TextField result;

    public Calculator() {
        super("Calculator");
        initFrame();
    }

    private void initFrame() {

        this.setLayout(null);
        this.setBounds(650, 300, 400, 150);
        this.setResizable(false);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        firstOperand = new TextField();
        firstOperand.setBounds(60, 60, 40, 40);
        firstOperand.setBackground(new Color(230, 230, 230));
        this.add(firstOperand);

        JButton divisionSymbol = new JButton("\\");
        divisionSymbol.setBounds(110, 60, 40, 40);
        divisionSymbol.setBackground(new Color(255, 255, 255));
        divisionSymbol.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.add(divisionSymbol);

        secondOperand = new TextField();
        secondOperand.setBounds(170, 60, 40, 40);
        secondOperand.setBackground(new Color(230, 230, 230));
        this.add(secondOperand);

        result = new TextField();
        result.setBounds(300, 60, 40, 40);
        result.setEditable(false);
        this.add(result);

        JButton equalButton = new JButton("=");
        equalButton.setBounds(230, 60, 60, 40);
        equalButton.setBackground(new Color(255, 255, 255));
        equalButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        equalButton.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                if (!(firstOperand.getText().equals("0") && secondOperand.getText().equals("0"))) {
                    try {
                        double operandOne = Double.parseDouble(firstOperand.getText());
                        double operandTwo = Double.parseDouble(secondOperand.getText());
                        double divisionResult = operandOne/operandTwo;
                        if(operandTwo==0){
                            throw new ArithmeticException("Can't divide by 0!");
                        } else if(operandTwo==13){
                            throw new UnluckyException("Can't divide by 13! You'll get unlucky!");
                        }
                        result.setText(""+divisionResult);
                    } catch (ArithmeticException exception) {
                        displayErrorMessage("Arithmetic Exception", exception.getMessage());
                    } catch (NumberFormatException exception) {
                        displayErrorMessage("Please insert valid input!", exception.getMessage());
                    } catch (UnluckyException exception){
                        displayErrorMessage("Unlucky Exception!",exception.getMessage());
                    }
                }
            }
        });
        this.add(equalButton);
    }

    private void displayErrorMessage(String title, String message) {
        JOptionPane.showMessageDialog(null,
                message,
                title,
                JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
