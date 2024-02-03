package org.example.problem2062;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countVowelSubstrings1() {
        String word = "aeiouu";
        int expected = 2;
        assertEquals(expected, new Solution().countVowelSubstrings(word));
    }
    @Test
    void countVowelSubstrings2() {
        String word = "unicornarihan";
        int expected = 0;
        assertEquals(expected, new Solution().countVowelSubstrings(word));
    }
    @Test
    void countVowelSubstrings3() {
        String word = "cuaieuouac";
        int expected = 7;
        assertEquals(expected, new Solution().countVowelSubstrings(word));
    }
    @Test
    void countVowelSubstrings4() {
        String word = "ughspuuoaaaoieiuiaoiuee";
        int expected = 7;
        assertEquals(expected, new Solution().countVowelSubstrings(word));
    }
}