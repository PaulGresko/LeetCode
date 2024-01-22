package org.example.problem14;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void longestCommonPrefix1(){
        String[] strs = {"flower","flow","flight"};
        String expected = "fl";
        assertEquals(expected, new Solution().longestCommonPrefix(strs));
    }
    @Test
    void longestCommonPrefix2(){
        String[] strs = {"dog","racecar","car"};
        String expected = "";
        assertEquals(expected, new Solution().longestCommonPrefix(strs));
    }

}
