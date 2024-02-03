package org.example.problem1513;

public class Solution {
    public int numSub(String s) {
        int count = 0;
        int one = 0;
        char[] string  = s.toCharArray();
        for(char str : string){
            if(str=='1'){
                one++;
                count+=one;
            }
            else {
                one = 0;
            }
        }
        return (int)count % 1000000007;
    }
}
