package com.leetcode;

public class MaxAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        // Step 1: Calculate sum of first k elements
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;

        // Step 2: Slide the window
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k]; // remove old, add new
            maxSum = Math.max(maxSum, sum);
        }

        // Step 3: Return max average
        return maxSum / k;
    }
