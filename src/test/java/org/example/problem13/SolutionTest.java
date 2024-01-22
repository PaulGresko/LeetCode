package org.example.problem13;

import org.example.problem13.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void romanToInt1() {
        String s = "III";
        int expected = 3;
        assertEquals(expected, new Solution().romanToInt(s));
    }
    @Test
    void romanToInt2() {
        String s = "LVIII";
        int expected = 58;
        assertEquals(expected, new Solution().romanToInt(s));
    }
    @Test
    void romanToInt3() {
        String s = "MCMXCIV";
        int expected = 1994;
        assertEquals(expected, new Solution().romanToInt(s));
    }

}
