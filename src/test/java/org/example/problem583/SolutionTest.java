package org.example.problem583;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minDistance1() {
        String word1 = "sea";
        String word2 = "eat";
        int expected = 2;
        assertEquals(expected, new Solution().minDistance(word1, word2));
    }

    @Test
    void minDistance2() {
        String word1 = "leetcode";
        String word2 = "etco";
        int expected = 4;
        assertEquals(expected, new Solution().minDistance(word1, word2));
    }
}