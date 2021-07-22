package com.jpassgo.javaalgorithms.merge_sort;

import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[23];

        Random random = new Random();

        for(int i = 0; i < 23; i++) {
            arr[i] = random.nextInt(999);
        }

        System.out.println("---- UNSORTED ----");
        for (int i = 0; i < 23; i++) {
            System.out.println(arr[i]);
        }

        mergeSort(arr);

        System.out.println("---- SORTED ----");
        for (int i = 0; i < 23; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void mergeSort(int[] array) {
        int[] helper = new int[array.length];
        mergeSort(array, helper, 0, array.length-1);
    }

    public static void mergeSort(int[] array, int[] helper, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(array, helper, left, mid);
            mergeSort(array, helper,mid + 1, right);
            merge(array, helper, left, mid, right);
        }
    }

    private static void merge(int[] array, int[] helper, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            helper[i] = array[i];
        }

        int helperLeft = left;
        int helperRight = mid+1;
        int current = left;

        while (helperLeft <= mid && helperRight <= right) {
            if(helper[helperLeft] <= helper[helperRight]) {
                array[current] = helper[helperLeft];
                helperLeft++;
            } else {
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = mid - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            array[current + i] = helper[helperLeft + i];
        }
    }
}
