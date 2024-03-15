package org.example.problem1768;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void mergeAlternately1() {
        String expected = "apbqcr";
        String word1 = "abc", word2 = "pqr";
        assertEquals(expected, new Solution().mergeAlternately(word1, word2));
    }

    @Test
    void mergeAlternately2() {

        String word1 = "abcd", word2 = "pq";
        String expected = "apbqcd";
        assertEquals(expected, new Solution().mergeAlternately(word1, word2));
    }

    @Test
    void mergeAlternately3() {
        String word1 = "ab", word2 = "pqrs";
        String expected = "apbqrs";
        assertEquals(expected, new Solution().mergeAlternately(word1, word2));
    }
}