package org.example.problem349;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void intersection1() {
        int [] nums1 = {1,2,2,1}, nums2 = {2,2};
        int[] expected = {2};
        assertArrayEquals(expected, new Solution().intersection(nums1, nums2));
    }

    @Test
    void intersection2() {
        int [] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        int[] expected = {4,9};
        assertArrayEquals(expected, new Solution().intersection(nums1, nums2));
    }
}