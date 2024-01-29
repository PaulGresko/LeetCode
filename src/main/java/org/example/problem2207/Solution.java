package org.example.problem2207;

public class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        long sum = 0;
        char pattern0 = pattern.charAt(0);
        char pattern1 = pattern.charAt(1);

        if(pattern0 == pattern1){
            int n = text.length() - text.replaceAll(String.valueOf(pattern.charAt(0)),"").length();
            return (long) n * (n + 1) / 2;
        }

        char[] chars = text.toCharArray();
        int a = 0;
        int b = 0;

        for (char c : chars){
            if(c == pattern0){
                ++a;
            } else if(c == pattern1){
                ++b;
                sum += a;
            }
        }
        return sum + (Math.max(a, b));
    }
}
