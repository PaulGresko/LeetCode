package org.example.problem26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeDuplicates1() {
        int[] nums = {1,1,2};
        int expected = 2;
        assertEquals(expected, new Solution().removeDuplicates(nums));
    }
    @Test
    void removeDuplicates2() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int expected = 5;
        assertEquals(expected, new Solution().removeDuplicates(nums));
    }
}