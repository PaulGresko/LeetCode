package org.example.problem2996;

import java.util.Arrays;

public class Solution {
    public int[][] divideArray(int[] nums, int k) {
        if(nums.length % 3 != 0) return new int[][] {};

        int[][] arrays = new int[(nums.length / 3)][3];
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i += 3){
            if(nums[i + 2] - nums[i] <= k){
                arrays[i/3][0]=nums[i];
                arrays[i/3][1]=nums[i+1];
                arrays[i/3][2]=nums[i+2];
            }else {
                return new int[][] {};
            }
        }
        return arrays;
    }
}
