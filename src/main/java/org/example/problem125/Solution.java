package org.example.problem125;

public class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^\\p{L}\\d]", "").toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while( left < right){
            if(s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}
