package org.example.problem35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void searchInsert1() {
        int [] nums = {1,3,5,6};
        int target = 5;
        int expected = 2;
        assertEquals(expected, new Solution().searchInsert(nums, target));
    }
    @Test
    void searchInsert2() {
        int [] nums = {1,3,5,6};
        int target = 2;
        int expected = 1;
        assertEquals(expected, new Solution().searchInsert(nums, target));
    }
    @Test
    void searchInsert3() {
        int [] nums = {1,3,5,6};
        int target = 7;
        int expected = 4;
        assertEquals(expected, new Solution().searchInsert(nums, target));
    }
    @Test
    void searchInsert4() {
        int [] nums = {1,3};
        int target = 2;
        int expected = 1;
        assertEquals(expected, new Solution().searchInsert(nums, target));
    }
}