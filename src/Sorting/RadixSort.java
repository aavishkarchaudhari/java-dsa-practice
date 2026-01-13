package Sorting;

import java.util.Scanner;

public class RadixSort {
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max)
                max = value;
        }
        return max;
    }

    public static void CountingSort(int[] arr, int place) {
        int n = arr.length;

        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            count[(arr[i] / place) % 10]++;
        }

        for(int i=1; i<10; i++){
            count[i] += count[i-1];
        }

        for(int i=n-1; i>=0; i--){
            int digit = (arr[i] / place) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        for(int i=0; i<n; i++){
            arr[i] = output[i];
        }
    }

    public static void RadixSort(int[] arr) {
        int max = getMax(arr);

        for (int place = 1; max / place > 0; place *= 10) {
            CountingSort(arr, place);
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
        RadixSort(arr);

        // Output the sorted array
        printArray(arr);

        sc.close();
    }
}
