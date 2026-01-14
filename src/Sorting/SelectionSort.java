package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void SelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int smallIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[smallIndex]) {
                    smallIndex = j;
                }
            }

            int temp = arr[smallIndex];
            arr[smallIndex] = arr[i];
            arr[i] = temp;
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
        SelectionSort(arr);

        // Output the sorted array
        printArray(arr);

        sc.close();
    }
}
