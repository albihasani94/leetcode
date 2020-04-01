package com.albi.single.number;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test1() {
        int[] nums = {2, 2, 1};
        int expected = 1;

        Solution solution = new Solution();

        assertEquals(expected, solution.singleNumber(nums));
    }

    @Test
    public void test2() {
        int[] nums = {4, 1, 2, 1, 2};
        int expected = 4;

        Solution solution = new Solution();

        assertEquals(expected, solution.singleNumber(nums));
    }

}
