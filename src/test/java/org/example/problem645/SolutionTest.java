package org.example.problem645;

import org.example.problem645.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void findErrorNums1() {
        int[] nums = new int[]{1,2,2,4};
        int[] expected = new int[]{2,3};
        assertArrayEquals(expected, new Solution().findErrorNums(nums));
    }

    @Test
    void findErrorNums2() {
        int[] nums = new int[]{1,1};
        int[] expected = new int[]{1,2};
        assertArrayEquals(expected, new Solution().findErrorNums(nums));
    }
    @Test
    void findErrorNums3() {
        int[] nums = new int[]{3,2,3,4,6,5};
        int[] expected = new int[]{3,1};
        assertArrayEquals(expected, new Solution().findErrorNums(nums));
    }
}
