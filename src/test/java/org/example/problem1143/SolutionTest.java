package org.example.problem1143;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestCommonSubsequence1() {
        String text1 = "abcde";
        String text2 = "ace";
        Integer expected = 3;
        assertEquals(expected, new Solution().longestCommonSubsequence(text1, text2));
    }
    @Test
    void longestCommonSubsequence2() {
        String text1 = "abc";
        String text2 = "abc";
        Integer expected = 3;
        assertEquals(expected, new Solution().longestCommonSubsequence(text1, text2));
    }
    @Test
    void longestCommonSubsequence3() {
        String text1 = "abc";
        String text2 = "def";
        Integer expected = 0;
        assertEquals(expected, new Solution().longestCommonSubsequence(text1, text2));
    }
    @Test
    void longestCommonSubsequence4() {
        String text1 = "psnw";
        String text2 = "vozsh";
        Integer expected = 1;
        assertEquals(expected, new Solution().longestCommonSubsequence(text1, text2));
    }
    @Test
    void longestCommonSubsequence5() {
        String text1 = "ezupkr";
        String text2 = "ubmrapg";
        Integer expected = 2;
        assertEquals(expected, new Solution().longestCommonSubsequence(text1, text2));
    }
}