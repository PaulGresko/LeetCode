package org.example.problem2488;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int countSubarrays(int[] nums, int k) {

        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        int count = 0;

        int i = 0;
        while (i < n && nums[i] != k) i++;

        if(nums[i]==k){
            count++;
            int balance = 0;
            for(int left = i-1; left >= 0; left--){
                if(nums[left] < k) balance -= 1;
                else if(nums[left] > k) balance += 1;

                map.put(balance, map.getOrDefault(balance,0) + 1);

                if(balance==1 || balance==0) count++;
            }
            balance = 0;
            for(int right = i + 1; right < n; right++){
                if(nums[right] < k) balance -= 1;
                else if(nums[right] > k) balance += 1;

                if(balance==1 || balance==0) count++;

                count += map.getOrDefault(-balance, 0);
                count += map.getOrDefault(1-balance, 0);
            }

        }
        return count;
    }
}
