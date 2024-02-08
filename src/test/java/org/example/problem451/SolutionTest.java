package org.example.problem451;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void frequencySort1() {
        String s = "tree";
        String expected = "eert";
        assertEquals(expected, new Solution().frequencySort(s));
    }
    @Test
    void frequencySort2() {
        String s = "cccaaa";
        String expected = "aaaccc";
        assertEquals(expected, new Solution().frequencySort(s));
    }
    @Test
    void frequencySort3() {
        String s = "Aabb";
        String expected = "bbAa";
        assertEquals(expected, new Solution().frequencySort(s));
    }
}