package org.example.problem169;

import java.util.Arrays;

public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int halfLength = nums.length / 2;
        int left = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if(i - left > halfLength){
                    return nums[i - 1];
                }
                else{
                    left = i;
                }
            }
        }
        if(nums.length - left > halfLength){
            return nums[nums.length - 1];
        }
        return -1;
    }
}
