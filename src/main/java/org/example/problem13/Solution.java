package org.example.problem13;

public class Solution {
    public int romanToInt(String s) {
        s += " ";
        int number = 0;

        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            char prevChar = s.charAt(i - 1);
            if (prevChar == 'I') {
                if (current == 'V') {
                    number += 4;
                    i++;
                } else if (current == 'X') {
                    number += 9;
                    i++;
                } else number += 1;
            }
            if (prevChar == 'V') {
                number += 5;
            }
            if (prevChar == 'X') {
                if (current == 'L') {
                    number += 40;
                    i++;
                } else if (current == 'C') {
                    number += 90;
                    i++;
                } else number += 10;
            }
            if (prevChar == 'L') {
                number += 50;
            }
            if (prevChar == 'C') {
                if (current == 'D') {
                    number += 400;
                    i++;
                } else if (current == 'M') {
                    number += 900;
                    i++;
                } else number += 100;
            }
            if (prevChar == 'D') {
                number += 500;
            }
            if (prevChar == 'M') {
                number += 1000;
            }
        }
        return number;
    }
}
