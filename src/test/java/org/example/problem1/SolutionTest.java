package org.example.problem1;

import org.example.problem1.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void twoSum1(){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] expected = {0,1};
        assertArrayEquals(expected, new Solution().twoSum(nums,target));
    }
    @Test
    void twoSum2(){
        int[] nums = {3,2,4};
        int target = 6;
        int[] expected = {1,2};
        assertArrayEquals(expected, new Solution().twoSum(nums,target));
    }
    @Test
    void twoSum3(){
        int[] nums = {3,3};
        int target = 6;
        int[] expected = {0,1};
        assertArrayEquals(expected, new Solution().twoSum(nums,target));
    }
}
