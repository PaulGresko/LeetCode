package org.example.problem516;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestPalindromeSubseq1() {
        String s = "bbbab";
        int expected = 4;
        assertEquals(expected, new Solution().longestPalindromeSubseq(s));
    }

    @Test
    void longestPalindromeSubseq2() {
        String s = "cbbd";
        int expected = 2;
        assertEquals(expected, new Solution().longestPalindromeSubseq(s));
    }
}