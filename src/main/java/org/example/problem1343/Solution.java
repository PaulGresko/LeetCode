package org.example.problem1343;


public class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        threshold = k * threshold;
        int count = 0;

        int sum = 0;
        for(int right = 0; right < k; right++){
            sum+=arr[right];
        }
        if(sum >= threshold) count++;

        for(int left = 0, right = k; right < arr.length; right++, left++){
            sum -= arr[left];
            sum += arr[right];

            if(sum >= threshold) count++;
        }

        return count;
    }
}
