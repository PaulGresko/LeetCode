package org.example.problem4;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int pointer = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] nums3 = new int[n1 + n2];

        while ( i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                nums3[pointer++] = nums1[i++];
            } else {
                nums3[pointer++] = nums2[j++];
            }
        }
        while ( i < n1 ){
            nums3[pointer++] = nums1[i++];
        }
        while ( j < n2 ){
            nums3[pointer++] = nums2[j++];
        }
        if(nums3.length % 2 == 0){
            int halfLength = nums3.length / 2;
            return (double) (nums3[halfLength] + nums3[halfLength - 1]) / 2;
        } else {
            return nums3[nums3.length / 2];
        }

    }
}
