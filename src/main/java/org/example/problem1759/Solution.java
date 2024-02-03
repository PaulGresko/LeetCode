package org.example.problem1759;

public class Solution {
    public int countHomogenous(String s) {
        int countTempChat = 0;
        int count = 0;
        char tempChar = ' ';
        char[] chars = s.toCharArray();
        for (char c : chars){
            if(c != tempChar){
                tempChar = c;
                countTempChat = 0;
            }
            count =  (count + ++countTempChat) % 1000000007;
        }
        return count;
    }
}
