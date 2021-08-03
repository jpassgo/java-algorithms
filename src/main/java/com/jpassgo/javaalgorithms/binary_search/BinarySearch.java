package com.jpassgo.javaalgorithms.binary_search;

import java.util.Random;

import static com.jpassgo.javaalgorithms.quick_sort.QuickSort.quickSort;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = new int[24];

        Random random = new Random();

        for (int i = 0; i < 23; i++) {
            array[i] = random.nextInt(999);
        }

        array[23] = 100;

        quickSort(array, 0, array.length - 1);
        System.out.println("Index of 100: " + binarySearch(array, 0, array.length - 1, 100));

        for (int i = 0; i < 23; i++) {
            System.out.println(array[i]);
        }

    }

    public static int binarySearch(int[] array, int low, int high, int value) {
        if(low > high) return -1;

        int mid = low + ((high - low) / 2);
        if(array[mid] > value) {
            return binarySearch(array, low, mid-1, value);
        } else if(array[mid] < value) {
            return binarySearch(array, mid+1, high, value);
        } else {
            return mid;
        }
    }
}
