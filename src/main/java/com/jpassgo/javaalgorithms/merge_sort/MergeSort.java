package com.jpassgo.javaalgorithms.merge_sort;

import java.util.Arrays;
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

        mergeSort(arr, 0, arr.length-1);

        System.out.println("---- SORTED ----");
        for (int i = 0; i < 23; i++) {
            System.out.println(arr[i]);
        }
    }

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

        int leftLength = leftArray.length-1;
        int rightLength = rightArray.length-1;

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i < right; i++) {
            if(leftIndex < leftLength && rightIndex < rightLength) {
                if(leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if(leftIndex < leftLength) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if(rightIndex < rightLength){
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}
