package com.jpassgo.javaalgorithms.merge_sort;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] array, int left, int right) {
        if (right <= left) return;
        int mid = (left+right)/2;

        mergeSort(array, left, mid);
        mergeSort(array, mid+1, right);
        merge(array, left, mid, right);
    }

    private static void merge(int[] array, int left, int mid, int right) {

        int leftArray[] = Arrays.copyOfRange(array, left, mid);
        int rightArray[] = Arrays.copyOfRange(array, mid+1, right);

        int leftLength = leftArray.length - 1;
        int rightLength = rightArray.length - 1;

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i < right; i++) {
            if(leftIndex < leftLength && rightIndex < rightLength) {

            }
        }
    }
}
