package Sorting;

import java.util.Scanner;

public class QuickSort {
    public static void QuickSort(int[] arr, int st, int end) {
        if (st < end) {
            int pivotIdx = partition(arr, st, end);
            QuickSort(arr, st, pivotIdx - 1);
            QuickSort(arr, pivotIdx + 1, end);
        }
    }

    public static int partition(int[] arr, int st, int end) {
        int idx = st - 1;
        int pivot = arr[end];

        for (int i = st; i < end; i++) {
            if (arr[i] <= pivot) {
                idx++;

                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }

        idx++;

        int temp = arr[end];
        arr[end] = arr[idx];
        arr[idx] = temp;

        return idx;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call your sorting function here
        QuickSort(arr, 0, n - 1);

        // Output the sorted array
        printArray(arr);

        sc.close();
    }
}
