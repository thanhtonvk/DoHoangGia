package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int index, i, a;
        Stack<Integer> s;
        for (; ; ) {
            int n = Integer.parseInt(f.readLine());
            if (n == 0) break;
            st = new StringTokenizer(f.readLine());
            index = 1;
            s = new Stack<Integer>();
            for (i = 0; i < n; i++) {
                a = Integer.parseInt(st.nextToken());

                if (a == index) {
                    index++;
                    continue;
                }

                while (s.size() > 0 && s.peek() == index) {
                    s.pop();
                    index++;
                }

                if (s.size() > 0 && s.peek() < a) break;

                s.push(a);
            }

            if (i == n) System.out.println("yes");
            else System.out.println("no");
            System.out.flush();
        }
    }
}
