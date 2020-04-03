package com.albi.maximum.subarray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test1() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected = 6;

        Solution solution = new Solution();

        assertEquals(expected, solution.maxSubArray(nums));
    }

}
