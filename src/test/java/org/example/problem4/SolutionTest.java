package org.example.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findMedianSortedArrays1() {
        int [] nums1 = {1,3}, nums2 = {2};
        double expected = 2.0;
        assertEquals(expected, new Solution().findMedianSortedArrays(nums1, nums2));
    }
    @Test
    void findMedianSortedArrays2() {
        int [] nums1 = {1,2}, nums2 = {3,4};
        double expected = 2.5;
        assertEquals(expected, new Solution().findMedianSortedArrays(nums1, nums2));
    }
}