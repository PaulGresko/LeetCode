package org.example.problem997;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findJudge1() {
        int n = 2;
        int[][] trust = {{1,2}};
        int expected = 2;
        assertEquals(expected, new Solution().findJudge(n,trust));
    }
    @Test
    void findJudge2() {
        int n = 3;
        int[][] trust = {{1,3},{2,3}};
        int expected = 3;
        assertEquals(expected, new Solution().findJudge(n,trust));
    }
    @Test
    void findJudge3() {
        int n = 3;
        int[][] trust = {{1,3},{2,3},{3,1}};
        int expected = -1;
        assertEquals(expected, new Solution().findJudge(n,trust));
    }
    @Test
    void findJudge4() {
        int n = 3;
        int[][] trust = {{1,3},{2,3},{3,1}};
        int expected = -1;
        assertEquals(expected, new Solution().findJudge(n,trust));
    }
    @Test
    void findJudge5() {
        int n = 1;
        int[][] trust = {};
        int expected = 1;
        assertEquals(expected, new Solution().findJudge(n,trust));
    }
}