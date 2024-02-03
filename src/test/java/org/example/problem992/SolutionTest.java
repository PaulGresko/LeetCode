package org.example.problem992;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void subarraysWithKDistinct1() {
        int[] nums = {1,2,1,2,3};
        int k = 2;
        int expected = 7;
        assertEquals(expected, new Solution().subarraysWithKDistinct(nums,k));
    }

    @Test
    void subarraysWithKDistinct2() {
        int[] nums = {1,2,1,3,4};
        int k = 3;
        int expected = 3;
        assertEquals(expected, new Solution().subarraysWithKDistinct(nums,k));
    }
}