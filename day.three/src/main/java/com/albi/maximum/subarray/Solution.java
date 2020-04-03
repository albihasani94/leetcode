package com.albi.maximum.subarray;

import java.util.*;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 * <p>
 * Note: If you have figured out the O(n) solution, try coding another solution using
 * the divide and conquer approach, which is more subtle.
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        int biggestSum = nums[0];

        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = i; j < length; j++) {
                sum += nums[j];
                if (sum > biggestSum) {
                    biggestSum = sum;
                }
            }
        }

        return biggestSum;
    }
}
