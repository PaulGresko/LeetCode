package org.example.problem2062;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public int countVowelSubstrings(String word) {
        return countVowelSubstringsWithKVowels(word, 5)-countVowelSubstringsWithKVowels(word, 4);
    }
    public int countVowelSubstringsWithKVowels(String word, int k) {
        char[] w = word.toCharArray();
        int left = 0;

        int count = 0;
        Set<Character> vowels = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');

        for(int right = 0; right < w.length; right++){
            if(vowels.contains(w[right])){
                map.put(w[right], map.getOrDefault(w[right], 0) + 1);
                while (map.size() > k){
                    char leftChar = w[left++];
                    if(map.get(leftChar)==1){
                        map.remove(leftChar);
                    } else {
                        map.put(leftChar, map.get(leftChar) - 1);
                    }
                }
            }else{
                map.clear();
                left=right + 1;
            }
            count +=  right - left;
        }
        return count;
    }
}
