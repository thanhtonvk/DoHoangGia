package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayQueue queue = new ArrayQueue();
        /*LinkedListQueue queue = new LinkedListQueue();*/
        LinkedListStack stack = new LinkedListStack();
        int n = 10;
        for (int i = 0; i < n; i++) {
            queue.enqueue(i);
            stack.push(i);
        }
        System.out.println("QUEUE");
        for (int i = 0; i < n; i++) {
            System.out.print(queue.dequeue());
        }
        System.out.println();
        System.out.println("STACK");
        for (int i = 0; i < n; i++) {
            System.out.print(stack.pop());
        }
    }
}
