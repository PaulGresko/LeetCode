package org.example.problem1689;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minPartitions1() {
        String n = "32";
        int expected = 3;
        assertEquals(expected, new Solution().minPartitions(n));
    }
    @Test
    void minPartitions2() {
        String n = "82734";
        int expected = 8;
        assertEquals(expected, new Solution().minPartitions(n));
    }

    @Test
    void minPartitions3() {
        String n = "27346209830709182346";
        int expected = 9;
        assertEquals(expected, new Solution().minPartitions(n));
    }
}