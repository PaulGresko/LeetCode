package org.example.problem50;

public class Solution {
    public double myPow(double x, int n) {
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
