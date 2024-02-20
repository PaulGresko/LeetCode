package org.example.problem169;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void majorityElement1() {
        int[] nums = {3, 2, 3};
        int expected = 3;
        assertEquals(expected, new Solution().majorityElement(nums));
    }
    @Test
    void majorityElement2() {
        int[] nums = {2,2,1,1,1,2,2};
        int expected = 2;
        assertEquals(expected, new Solution().majorityElement(nums));
    }
}