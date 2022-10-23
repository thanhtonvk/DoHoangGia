package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        SimpleSort simpleSort = new SimpleSort();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt();
        }
        //bubble sort
        /*simpleSort.bubbleSort(arr);*/


        //selection sort
        /*  simpleSort.selectionSort(arr);*/


        //quick sort

        /*  simpleSort.quickSort(arr);*/
    }
}
