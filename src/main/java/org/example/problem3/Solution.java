package org.example.problem3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxSize = 0;
        int left = 0;
        char[] string = s.toCharArray();
        for (int right = 0; right < s.length(); right++) {
            while(!set.add(string[right])) {
                set.remove(string[left++]);
            }
            maxSize = Math.max(maxSize, right - left + 1);
        }

        return maxSize;
    }
}
