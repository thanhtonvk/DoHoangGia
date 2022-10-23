package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String str = new String();
        int i = Integer.parseInt(sc.nextLine());
        while (i > 100) {
            i = Integer.parseInt(sc.nextLine());
        }
        while (i > 0) {
            str = sc.nextLine();
            while (str.length()>400){
                str = sc.nextLine();
            }
            Stack stk = new Stack();
            String rnp = new String();
            int len = str.length();
            char c;
            for (int k = 0; k < len; k++) {
                c = str.charAt(k);
                switch (c) {
                    case '(':
                        break;

                    case '+':
                        stk.push(c);
                        break;

                    case '-':
                        stk.push(c);
                        break;

                    case '*':
                        stk.push(c);
                        break;

                    case '/':
                        stk.push(c);
                        break;

                    case '^':
                        stk.push(c);
                        break;

                    case ')':
                        rnp = rnp + stk.pop();
                        break;

                    default:
                        rnp = rnp + c;
                        break;
                }
            }
            System.out.println(rnp);
            i--;
        }
    }
}

