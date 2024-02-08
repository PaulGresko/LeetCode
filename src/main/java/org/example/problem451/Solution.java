package org.example.problem451;

import java.util.*;

public class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] ss =  s.toCharArray();

        for(char c : ss){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = map
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .toList();

        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry entry : list){
            int n = (int)entry.getValue();
            stringBuilder.append(String.valueOf(entry.getKey()).repeat(Math.max(0, n)));
        }

        return stringBuilder.toString();
    }
}
