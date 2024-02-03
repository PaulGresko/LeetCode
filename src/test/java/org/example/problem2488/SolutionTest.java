package org.example.problem2488;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countSubarrays1() {
        int[] nums = {3,2,1,4,5};
        int k = 4;
        int expected = 3;
        assertEquals(expected, new Solution().countSubarrays(nums,k));
    }

    @Test
    void countSubarrays2() {
        int[] nums = {2,3,1};
        int k = 3;
        int expected = 1;
        assertEquals(expected, new Solution().countSubarrays(nums,k));
    }
    @Test
    void countSubarrays3() {
        int[] nums = {2,5,1,4,3,6};
        int k = 1;
        int expected = 3;
        assertEquals(expected, new Solution().countSubarrays(nums,k));
    }
}