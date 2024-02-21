package org.example.problem201;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void rangeBitwiseAnd1() {
        int left = 5, right = 7;
        int expected = 4;
        assertEquals(expected, new Solution().rangeBitwiseAnd(left, right));
    }
    @Test
    void rangeBitwiseAnd2() {
        int left = 0, right = 0;
        int expected = 0;
        assertEquals(expected, new Solution().rangeBitwiseAnd(left, right));
    }
    @Test
    void rangeBitwiseAnd3() {
        int left = 1, right = 2147483647;
        int expected = 0;
        assertEquals(expected, new Solution().rangeBitwiseAnd(left, right));
    }
}