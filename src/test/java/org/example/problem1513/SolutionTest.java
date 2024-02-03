package org.example.problem1513;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numSub1() {
        String s = "0110111";
        int expected = 9;
        assertEquals(expected, new Solution().numSub(s));
    }
    @Test
    void numSub2() {
        String s = "101";
        int expected = 2;
        assertEquals(expected, new Solution().numSub(s));
    }
    @Test
    void numSub3() {
        String s = "111111";
        int expected = 21;
        assertEquals(expected, new Solution().numSub(s));
    }
}