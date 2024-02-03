package org.example.problem992;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subarrays(nums,k) - subarrays(nums, k - 1);
    }

    public int subarrays(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while (map.size() > k){
                int l = nums[left++];
                if(map.get(l)==1){
                    map.remove(l);
                } else {
                    map.put(l, map.get(l) - 1);
                }
            }
            count += right - left;
        }
        return count;
    }


}
