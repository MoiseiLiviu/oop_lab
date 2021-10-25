package com.liviu.lab_4.task1;


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

    public static void main(String[] args) {

        //Why use stack???
        String expr1 = "2 * 4 + (3 +6 * 9 -    12 * (2*9 - 15))  + 2 +(-4)*((2 - 15))";
        System.out.println(isBalanced(expr1));
    }
}
