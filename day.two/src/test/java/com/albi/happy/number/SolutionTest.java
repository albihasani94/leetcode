package com.albi.happy.number;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test1() {
        int input = 19;
        boolean expected = true;

        Solution solution = new Solution();

        assertEquals(expected, solution.isHappy(input));
    }

}
