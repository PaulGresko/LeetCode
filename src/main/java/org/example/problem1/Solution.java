package org.example.problem1;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indexes = {0,0};
        for(int i = 0; i < nums.length-1;i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    indexes[0] = i;
                    indexes[1] = j;
                    return indexes;
                }
            }
        }
        return indexes;
    }
}
