package org.example.problem372;


public class Solution {
    public int superPow(int a, int[] b) {
        int n = b[0];
        for (int i = 1; i < b.length; i++){
            n = n*10 + b[i];
        }
        System.out.println(n);
        return (int) pow(a,n);
    }

    public static double pow(double x, int n) {
        double nn = n;
        if (nn == 0 || x == 1)
            return 1;
        double result = 1;
        if (nn < 0) {
            x = 1 / x;
            nn = -nn;
        }
        while (nn > 0) {
            if (nn % 2 == 0) {
                x = x * x;
                nn = nn / 2;
            } else {
                result *= x;
                nn--;
            }
        }
        return result;
    }
}
