package com.albi.move.zeroes;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    @Test
    public void test1() {
        int[] nums = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};

        Solution solution = new Solution();
        solution.moveZeroes(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    public void test2() {
        int[] nums = {0, 1, 0};
        int[] expected = {1, 0, 0};

        Solution solution = new Solution();
        solution.moveZeroes(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    public void test3() {
        int[] nums = {0, 0, 1};
        int[] expected = {1, 0, 0};

        Solution solution = new Solution();
        solution.moveZeroes(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    public void test4() {
        int[] nums = {0, 0, 0};
        int[] expected = {0, 0, 0};

        Solution solution = new Solution();
        solution.moveZeroes(nums);

        assertArrayEquals(expected, nums);
    }

}
