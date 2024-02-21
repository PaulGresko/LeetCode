package org.example.problem201;

public class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        while (left != right) {
            if(left < right) right = right & (right - 1);
            else  left = left & (left - 1);
        }
        return left;
    }
}
