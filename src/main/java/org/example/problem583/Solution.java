package org.example.problem583;

public class Solution {
    public int minDistance(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();

        int[][] common = new int[length1 + 1][length2 + 1];
        for (int i = 1; i <= length1; i++){
            for (int j = 1; j <= length2; j++){
                if(c1[i-1] == c2[j-1]){
                    common[i][j] = common[i - 1][j - 1] + 1;
                } else {
                    common[i][j] = Math.max(common[i - 1][j], common[i][j - 1]);
                }
            }
        }
        return length1 + length2 - 2 * common[length1][length2];
    }
}
