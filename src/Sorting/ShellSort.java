package Sorting;

import java.util.Scanner;

public class ShellSort {
    public static void ShellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap >= 1; gap /= 2) {
            for (int j = gap; j < n; j++) {
                for (int i = j - gap; i >= 0; i -= gap) {
                    if (arr[i + gap] > arr[i]) {
                        break;
                    } else {
                        int temp = arr[i + gap];
                        arr[i + gap] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
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
        ShellSort(arr);

        // Output the sorted array
        printArray(arr);

        sc.close();
    }
}
