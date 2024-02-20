package org.example.problem231;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPowerOfTwo1() {
        int n = 1;
        assertTrue(new Solution().isPowerOfTwo(n));
    }
    @Test
    void isPowerOfTwo2() {
        int n = 16;
        assertTrue(new Solution().isPowerOfTwo(n));
    }
    @Test
    void isPowerOfTwo3() {
        int n = 0;
        assertFalse(new Solution().isPowerOfTwo(n));
    }
}