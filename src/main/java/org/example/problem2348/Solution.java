package org.example.problem2348;

public class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        int zero = 0;
        for (int n : nums){
            if(n == 0){
                count += ++zero;
            }else {
                zero = 0;
            }
        }
        return count;
    }
}
