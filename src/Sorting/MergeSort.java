package Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void MergeSort(int[] arr, int st, int end) {
        if (st < end) {
            int mid = st + (end - st) / 2;

            MergeSort(arr, st, mid);
            MergeSort(arr, mid + 1, end);

            merge(arr, st, mid, end);
        }
    }

    public static void merge(int[] arr, int st, int mid, int end) {
        int[] temp = new int[end - st + 1];
        int i = st;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (int index = 0; index < temp.length; index++) {
            arr[st + index] = temp[index];
        }
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
        MergeSort(arr, 0, n - 1);

        // Output the sorted array
        printArray(arr);

        sc.close();
    }
}
