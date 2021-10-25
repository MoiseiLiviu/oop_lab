package com.liviu.lab_4.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static boolean isBalanced(String exp)
    {
        boolean flag = true;
        int count = 0;
        for(int i = 0; i < exp.length(); i++)
        {
            if (exp.charAt(i) == '(')
            {
                count++;
            }
            else if(exp.charAt(i) == ')')
            {
                count--;
            }
            if (count < 0)
            {
                flag = false;
                break;
            }
        }
        if (count != 0)
        {
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) throws IOException {

        //Why use stack????
        BufferedReader fileReader = new BufferedReader(new FileReader("src/com/liviu/lab_4/task2/three_expressions.txt"));
        String line = null;
        boolean passed = true;
        while((line=fileReader.readLine())!=null){
            System.out.println(isBalanced(line));
        }
    }
}
