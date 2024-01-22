package org.example.problem58;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lengthOfLastWord1() {
        String s = "Hello World";
        int expected = 5;
        assertEquals(expected, new Solution().lengthOfLastWord(s));
    }
    @Test
    void lengthOfLastWord2() {
        String s = "   fly me   to   the moon  ";
        int expected = 4;
        assertEquals(expected, new Solution().lengthOfLastWord(s));
    }
    @Test
    void lengthOfLastWord3() {
        String s = "luffy is still joyboy";
        int expected = 6;
        assertEquals(expected, new Solution().lengthOfLastWord(s));
    }
}