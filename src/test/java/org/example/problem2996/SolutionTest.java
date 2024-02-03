package org.example.problem2996;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void divideArray1() {
        int[] nums = {1,3,4,8,7,9,3,5,1};
        int k = 2;
        int[][] expected = {{1,1,3},{3,4,5},{7,8,9}};
        assertArrayEquals(expected, new Solution().divideArray(nums, k));
    }
    @Test
    void divideArray2() {
        int[] nums = {1,3,3,2,7,3};
        int k = 3;
        int[][] expected = {};
        assertArrayEquals(expected, new Solution().divideArray(nums, k));
    }
}