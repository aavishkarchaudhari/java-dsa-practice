package Sorting;

import java.util.Scanner;

public class CountingSort {

    public static void CountingSort(int[] arr) {
        int n = arr.length;

        int[] output = new int[n];

        // Find the maximum element to size the count array
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        int[] count = new int[max + 1]; // Create count array

        // Count frequency of each element
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Cumulative count
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array (Stable sort)
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy sorted output to original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
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

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        CountingSort(arr);

        printArray(arr);

        sc.close();
    }
}
