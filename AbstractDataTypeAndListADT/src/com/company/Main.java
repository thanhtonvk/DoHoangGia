package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int n = 10;
        SimpleArrayList list = new SimpleArrayList(n);
        /*SimpleLinkedList list = new SimpleLinkedList(n);*/

        //add to list
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        //display
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        //delete
        int value = 0;
        list.remove(value);
        //display
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        //set value
        int idx = 5;
        value = 15;
        list.set(idx, value);
        //display
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
