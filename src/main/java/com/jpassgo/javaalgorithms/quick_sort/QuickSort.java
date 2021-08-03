package com.jpassgo.javaalgorithms.quick_sort;

import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[23];

        Random random = new Random();

        for (int i = 0; i < 23; i++) {
            array[i] = random.nextInt(999);
        }

        System.out.println("---- UNSORTED ----");
        for (int i = 0; i < 23; i++) {
            System.out.println(array[i]);
        }

        quickSort(array, 0, array.length-1);

        System.out.println("---- SORTED ----");
        for (int i = 0; i < 23; i++) {
            System.out.println(array[i]);
        }
    }

    public static void quickSort(int[] array, int left, int right) {
        int index = partition(array, left, right);
        if(left < index - 1) {
            quickSort(array, left, index - 1);
        }
        if(index < right) {
            quickSort(array, index, right);
        }
    }

    public static int partition(int[] array, int left, int right) {
        int pivot = array[left + (right - left) / 2];

        while(left <= right) {
            while(array[left] < pivot) {
                left++;
            }

            while(array[right] > pivot) {
                right--;
            }

            if(left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
