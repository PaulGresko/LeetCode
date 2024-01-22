package org.example.problem66;

public class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while(i>=0){
            if(digits[i]==9){
                digits[i--]=0;
            }else{
                digits[i]++;
                return digits;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
