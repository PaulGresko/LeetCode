package org.example.problem645;


import java.util.HashMap;

public class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int[] countOfNumber = new int[nums.length + 1];

        for(int n : nums){
            countOfNumber[n]++;
        }
        for (int i = 0; i < countOfNumber.length; i++){
            if(countOfNumber[i] == 2){
                result[0] = i;
            }
            else if(countOfNumber[i] == 0){
                result[1] = i;
            }
        }
        return result;
    }
}
