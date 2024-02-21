package org.example.problem268;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void missingNumber1() {
        int[] nums = {3,0,1};
        int expected = 2;
        assertEquals(expected, new Solution().missingNumber(nums));
    }
    @Test
    void missingNumber2() {
        int[] nums = {0,1};
        int expected = 2;
        assertEquals(expected, new Solution().missingNumber(nums));
    }
    @Test
    void missingNumber3() {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int expected = 8;
        assertEquals(expected, new Solution().missingNumber(nums));
    }
}