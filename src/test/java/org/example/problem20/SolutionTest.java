package org.example.problem20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isValid1(){
        String s = "()";
        Boolean expected = true;
        assertEquals(expected, new Solution().isValid(s));
    }
    @Test
    void isValid2(){
        String s = "()[]{}";
        Boolean expected = true;
        assertEquals(expected, new Solution().isValid(s));
    }
    @Test
    void isValid3(){
        String s = "(]";
        Boolean expected = false;
        assertEquals(expected, new Solution().isValid(s));
    }
    @Test
    void isValid4(){
        String s = "([)]";
        Boolean expected = false;
        assertEquals(expected, new Solution().isValid(s));
    }
    @Test
    void isValid5(){
        String s = "[";
        Boolean expected = false;
        assertEquals(expected, new Solution().isValid(s));
    }
}