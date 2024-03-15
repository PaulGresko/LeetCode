package org.example.problem50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void myPow1() {
        double x = 2;
        int n = 10;
        double expected = 1024;
        assertEquals(expected, new Solution().myPow(x,n));
    }
    @Test
    void myPow2() {
        double x = 2.1;
        int n = 3;
        double expected = 9.26100;
        assertEquals(expected, new Solution().myPow(x,n));
    }
    @Test
    void myPow3() {
        double x = 2;
        int n = -2;
        double expected = 0.25;
        assertEquals(expected, new Solution().myPow(x,n));
    }
}