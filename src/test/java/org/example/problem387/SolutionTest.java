package org.example.problem387;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void firstUniqChar1() {
        String s = "leetcode";
        int expected = 0;
        assertEquals(expected,new Solution().firstUniqChar(s));
    }
    @Test
    void firstUniqChar2() {
        String s = "loveleetcode";
        int expected = 2;
        assertEquals(expected,new Solution().firstUniqChar(s));
    }
    @Test
    void firstUniqChar3() {
        String s = "aabb";
        int expected = -1;
        assertEquals(expected,new Solution().firstUniqChar(s));
    }
}