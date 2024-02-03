package org.example.problem1343;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numOfSubarrays1() {
        int[] arr = { 2,2,2,2,5,5,5,8 };
        int k = 3, threshold = 4;
        int expected = 3;
        assertEquals(expected, new Solution().numOfSubarrays(arr,k,threshold));
    }
    @Test
    void numOfSubarrays2() {
        int[] arr = { 11,13,17,23,29,31,7,5,2,3 };
        int k = 3, threshold = 5;
        int expected = 6;
        assertEquals(expected, new Solution().numOfSubarrays(arr,k,threshold));
    }
}