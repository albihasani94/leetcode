package com.albi.move.zeroes;

/**
 * Given an array nums, write a function to move all 0's to the end of it
 * while maintaining the relative order of the non-zero elements.
 * Note: You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
