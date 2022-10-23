package com.company;

public class SimpleSort {
    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //bai 1
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
            printArr(arr);
        }
        System.out.println("Số lần đổi chỗ và so sánh: " + count);

    }

    //bai 2
    public void selectionSort(int[] arr) {
        int n = arr.length;
        int count = 0;
        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {
            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                    count++;
                }

            }
            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            printArr(arr);
        }
        System.out.println("Số lần đổi chỗ và so sánh: " + count);
    }


    //bai 3
    int count = 0;

    public int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // Nếu phần tử hiện tại nhỏ hơn chốt
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] và arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                count++;
            }
        }
        // swap arr[i+1] và arr[high] (hoặc pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        printArr(arr);
        return i + 1;
    }

    public void sort(int[] arr, int low, int high) {
        if (low < high) {
            // pi là chỉ mục của chốt, arr[pi] vị trí của chốt
            int pi = partition(arr, low, high);
            // Sắp xếp đệ quy các phần tử
            // trướcphân vùng và sau phân vùng
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public void quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
        System.out.println("Số lần đổi chỗ và so sánh: " + count);
    }
}
