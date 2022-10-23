package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        SimpleSort simpleSort = new SimpleSort();
        int n = 10;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        //bubble sort
        /*simpleSort.bubbleSort(arr);*/


        //selection sort
        /*  simpleSort.selectionSort(arr);*/


        //quick sort

        /*  simpleSort.quickSort(arr);*/
    }
}
