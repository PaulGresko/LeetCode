package org.example.problem1291;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new LinkedList<>();
        String numbers = "123456789";

        for (int left = 0; left < 9; left++){
            for (int right = left+1; right <= 9; right++){
                int subNumber = Integer.parseInt(numbers.substring(left, right));
                if(low <= subNumber && subNumber <= high) list.add(subNumber);
            }
        }
        list.sort(null);
        return list;
    }
}
