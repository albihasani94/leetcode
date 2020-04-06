package best.time.stock;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 7;

        Solution solution = new Solution();

        assertEquals(expected, solution.maxProfit(prices));
    }

    @Test
    public void test2() {
        int[] prices = {1, 2, 3, 4, 5};
        int expected = 4;

        Solution solution = new Solution();

        assertEquals(expected, solution.maxProfit(prices));
    }

    @Test
    public void test3() {
        int[] prices = {7, 6, 4, 3, 1};
        int expected = 0;

        Solution solution = new Solution();

        assertEquals(expected, solution.maxProfit(prices));
    }
}