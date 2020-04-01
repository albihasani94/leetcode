package com.albi.single.number;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * Example 1:
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int number : nums) {
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }

        return map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .findAny()
                .map(Map.Entry::getKey)
                .orElse(0);
    }
}
