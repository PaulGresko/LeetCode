package org.example.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lengthOfLongestSubstring1() {
        String s = "abcabcbb";
        int expected = 3;
        assertEquals(expected, new Solution().lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring2() {
        String s = "bbbbb";
        int expected = 1;
        assertEquals(expected, new Solution().lengthOfLongestSubstring(s));
    }

    @Test
    void lengthOfLongestSubstring3() {
        String s = "pwwkew";
        int expected = 3;
        assertEquals(expected, new Solution().lengthOfLongestSubstring(s));
    }
    @Test
    void lengthOfLongestSubstring4() {
        String s = "au";
        int expected = 2;
        assertEquals(expected, new Solution().lengthOfLongestSubstring(s));
    }
    @Test
    void lengthOfLongestSubstring5() {
        String s = "dvdf";
        int expected = 3;
        assertEquals(expected, new Solution().lengthOfLongestSubstring(s));
    }
    @Test
    void lengthOfLongestSubstring6() {
        String s = "asjrgapa";
        int expected = 6;
        assertEquals(expected, new Solution().lengthOfLongestSubstring(s));
    }
}