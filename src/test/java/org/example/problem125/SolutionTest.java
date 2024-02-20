package org.example.problem125;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPalindrome1() {
        String s = "A man, a plan, a canal: Panama";
        assertTrue(new Solution().isPalindrome(s));
    }
    @Test
    void isPalindrome2() {
        String s = "race a car";
        assertFalse(new Solution().isPalindrome(s));
    }
    @Test
    void isPalindrome3() {
        String s = " ";
        assertTrue(new Solution().isPalindrome(s));
    }
    @Test
    void isPalindrome4() {
        String s = "0P";
        assertFalse(new Solution().isPalindrome(s));
    }
}