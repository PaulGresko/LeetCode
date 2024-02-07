package org.example.problem387;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int firstUniqChar(String s) {
        char[] ss = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : ss){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            if(map.get(ss[i])==1) return i;
        }
        return -1;
    }
}
