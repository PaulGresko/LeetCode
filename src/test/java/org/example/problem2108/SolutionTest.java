package org.example.problem2108;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void firstPalindrome1() {
        String[] words = {"abc","car","ada","racecar","cool"};
        String expected = "ada";
        assertEquals(expected, new Solution().firstPalindrome(words));
    }
    @Test
    void firstPalindrome2() {
        String[] words = {"notapalindrome","racecar"};
        String expected = "racecar";
        assertEquals(expected, new Solution().firstPalindrome(words));
    }
    @Test
    void firstPalindrome3() {
        String[] words = {"def","ghi"};
        String expected = "";
        assertEquals(expected, new Solution().firstPalindrome(words));
    }
}