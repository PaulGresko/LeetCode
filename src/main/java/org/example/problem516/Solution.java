package org.example.problem516;

public class Solution {
    public int longestPalindromeSubseq(String s) {
        int length = s.length();
        char[] c1 = s.toCharArray();
        char[] c2 = new StringBuilder(s).reverse().toString().toCharArray();

        int[][] polyndrome = new int[length + 1][length + 1];
        for (int i = 1; i <= length; i++){
            for (int j = 1; j <= length; j++){
                if(c1[i-1]==c2[j-1]){
                    polyndrome[i][j] = polyndrome[i - 1][j - 1] + 1;
                } else {
                    polyndrome[i][j] = Math.max(polyndrome[i - 1][j],polyndrome[i][j - 1]);
                }
            }
        }
        return polyndrome[length][length];
    }
}
