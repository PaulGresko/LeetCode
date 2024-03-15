package org.example.problem372;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void superPow1() {
        int a = 2;
        int[] b = {3};
        int expected = 8;
        assertEquals(expected, new Solution().superPow(a,b));
    }
    @Test
    void superPow2() {
        int a = 2;
        int[] b = {1,0};
        int expected = 1024;
        assertEquals(expected, new Solution().superPow(a,b));
    }
    @Test
    void superPow3() {
        int a = 1;
        int[] b = {4,3,3,8,5,2};
        int expected = 1;
        assertEquals(expected, new Solution().superPow(a,b));
    }
    @Test
    void superPow4() {
        int a = 2147483647;
        int[] b = {2,0,0};
        int expected = 1198;
        assertEquals(expected, new Solution().superPow(a,b));
    }
}