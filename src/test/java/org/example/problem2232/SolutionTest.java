package org.example.problem2232;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minimizeResult1() {
        String expression = "247+38";
        String expected = "2(47+38)";
        assertEquals(expected,new Solution().minimizeResult(expression));
    }

    @Test
    void minimizeResult2() {
        String expression = "12+34";
        String expected = "1(2+3)4";
        assertEquals(expected,new Solution().minimizeResult(expression));
    }
    @Test
    void minimizeResult3() {
        String expression = "999+999";
        String expected = "(999+999)";
        assertEquals(expected,new Solution().minimizeResult(expression));
    }
    @Test
    void minimizeResult4() {
        String expression = "1+1";
        String expected = "(1+1)";
        assertEquals(expected,new Solution().minimizeResult(expression));
    }
    @Test
    void minimizeResult5() {
        String expression = "99999999+9";
        String expected = "9(9999999+9)";
        assertEquals(expected,new Solution().minimizeResult(expression));
    }
    @Test
    void minimizeResult6() {
        String expression = "5+938";
        String expected = "(5+9)38";
        assertEquals(expected,new Solution().minimizeResult(expression));
    }
}