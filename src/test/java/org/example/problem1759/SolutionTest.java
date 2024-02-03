package org.example.problem1759;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countHomogenous1() {
        String s = "abbcccaa";
        int expected = 13;
        assertEquals(expected, new Solution().countHomogenous(s));
    }
    @Test
    void countHomogenous2() {
        String s = "xy";
        int expected = 2;
        assertEquals(expected, new Solution().countHomogenous(s));
    }
    @Test
    void countHomogenous3() {
        String s = "zzzzz";
        int expected = 15;
        assertEquals(expected, new Solution().countHomogenous(s));
    }
}