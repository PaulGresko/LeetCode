package org.example.problem268;

import java.util.Arrays;

public class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        for (; i < nums.length; i++){
            if(nums[i] != i) return i;
        }
        return i;
    }
}
