package org.example.problem2348;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void zeroFilledSubarray1() {
        int[] nums = {1,3,0,0,2,0,0,4};
        int expected = 6;
        assertEquals(expected, new Solution().zeroFilledSubarray(nums));
    }
    @Test
    void zeroFilledSubarray2() {
        int[] nums = {0,0,0,2,0,0};
        int expected = 9;
        assertEquals(expected, new Solution().zeroFilledSubarray(nums));
    }
    @Test
    void zeroFilledSubarray3() {
        int[] nums = {2,10,2019};
        int expected = 0;
        assertEquals(expected, new Solution().zeroFilledSubarray(nums));
    }
}