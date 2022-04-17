package com.jpassgo.javaalgorithms.leet_code;

import java.util.Arrays;

public class SlidingWindow {

    public static void main(String[] args) {
        System.out.println(largestSum(new int[] {1, 5, 2, 3, 7, 1}, 3));
    }

    public static int largestSum(int[] array, int k) {
        int currentMaxWindow  = Arrays.stream(Arrays.copyOfRange(array, 0, k)).sum();

        for (int i = 0; i < array.length - k; i++) {
            currentMaxWindow = Math.max(currentMaxWindow, (currentMaxWindow - array[i] + array[i+k]));
        }

        return currentMaxWindow;
    }
}
