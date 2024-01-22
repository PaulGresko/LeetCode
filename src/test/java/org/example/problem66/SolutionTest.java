package org.example.problem66;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

    @Test
    void plusOne1() {
        int[] digits = {1,2,3};
        int [] expected = {1,2,4};
        assertArrayEquals(expected, new Solution().plusOne(digits));
    }
    @Test
    void plusOne2() {
        int[] digits = {4,3,2,1};
        int [] expected = {4,3,2,2};
        assertArrayEquals(expected, new Solution().plusOne(digits));
    }
    @Test
    void plusOne3() {
        int[] digits = {9};
        int [] expected = {1,0};
        assertArrayEquals(expected, new Solution().plusOne(digits));
    }
}