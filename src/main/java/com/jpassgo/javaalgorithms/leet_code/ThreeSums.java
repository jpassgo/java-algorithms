package com.jpassgo.javaalgorithms.leet_code;

import java.util.*;

/*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.*/
// https://leetcode.com/problems/3sum/
public class ThreeSums {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(Solution.threeSum(nums));
    }

    static class Solution {
        public static List<List<Integer>> threeSum(int[] nums) {
            Integer firstValue = null;
            Integer secondValue = null;
            Integer thirdValue = null;

            Set<List<Integer>> triplets = new HashSet<List<Integer>>();

            int firstCounter = 0;
            for (int i = 0; i < nums.length; i++) {
                if (firstValue == null) {
                    firstValue = nums[i];
                } else if (secondValue == null) {
                    secondValue = nums[i];
                } else if (thirdValue == null) {
                    if (firstValue + secondValue + nums[i] != 0) {
                        continue;
                    } else {
                        thirdValue = nums[i];
                        i = ++firstCounter;
                        triplets.add(Arrays.asList(firstValue, secondValue, thirdValue));
                        firstValue = null;
                        secondValue = null;
                        thirdValue = null;
                    }
                }
            }

            List<List<Integer>> finalList = new ArrayList<List<Integer>>();
            for (List<Integer> triplet : triplets) {
                finalList.add(triplet);
            }
            return finalList;
        }
    }
}
