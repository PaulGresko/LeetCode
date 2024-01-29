package org.example.problems67;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void addBinary1() {
        String a = "11";
        String b = "1";
        String expected = "100";
        assertEquals(expected, new Solution().addBinary(a,b));
    }
    @Test
    void addBinary2() {
        String a = "1010";
        String b = "1011";
        String expected = "10101";
        assertEquals(expected, new Solution().addBinary(a,b));
    }
}