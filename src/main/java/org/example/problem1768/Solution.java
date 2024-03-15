package org.example.problem1768;

public class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();
        int len = Math.min(word1.length(), word2.length());
        int i;
        for(i = 0; i < len; i++){
            stringBuilder.append(word1.charAt(i));
            stringBuilder.append(word2.charAt(i));
        }
        stringBuilder.append(word1.substring(i));
        stringBuilder.append(word2.substring(i));
        return stringBuilder.toString();
    }
}
