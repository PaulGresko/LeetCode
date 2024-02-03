package org.example.problem2232;


public class Solution {
    public String minimizeResult(String expression) {
        String[] nums = expression.split("\\+");

        int n1 = nums[0].length(), n2 = nums[1].length();

        int a = Integer.parseInt(nums[0]), a1 = 0, a2 = a;
        int b = Integer.parseInt(nums[1]), b1 = b, b2 = 0;
        int min = a + b;
        String result = "(" + expression + ")";
        for(int i = 0; i < n1; ++i){
            b1=b;
            b2=0;
            for(int j = 0; j < n2; ++j){
                int tempValue = (a1==0 ? 1 : a1) * (a2 + b1) * (b2==0 ? 1 : b2);
                if(tempValue < min){
                    min = tempValue;
                    result = "" + (a1==0 ? "" : a1) + "(" + a2 + "+" + b1 + ")" + (b2==0 ? "" : b2);
                }
                b2 = b2 + (int)Math.pow(10, j) * (b1 % 10);
                b1 = b1 / 10;
            }
            a1 = a1 * 10 + (int)(a2 / Math.pow(10, n1-1-i));
            a2 = a % (int)Math.pow(10, n1-1-i);
        }

        return result;
    }
}
