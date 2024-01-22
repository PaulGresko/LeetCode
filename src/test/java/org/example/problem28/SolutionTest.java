package org.example.problem28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void strStr1() {
        String haystack = "sadbutsad", needle = "sad";
        int expected = 0;
        assertEquals(expected, new Solution().strStr(haystack, needle));
    }
    @Test
    void strStr2() {
        String haystack = "leetcode", needle = "leeto";
        int expected = -1;
        assertEquals(expected, new Solution().strStr(haystack, needle));
    }
}