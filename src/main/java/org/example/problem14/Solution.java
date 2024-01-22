package org.example.problem14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1){return strs[0];}
        String substring = "";
        int min=Integer.MAX_VALUE;
        for (String str : strs) {
            min = Math.min(min, str.length());
        }
        int i = 0;
        while (i < min && strs[0].charAt(i) == strs[1].charAt(i)){
            i++;
        }


        substring = strs[0].substring(0,i);
        if(substring.equals("")) return substring;


        for(int j = 2; j < strs.length; j++) {
            i = 0;
            while (i < substring.length() && strs[j].charAt(i) == substring.charAt(i)){
                i++;
            }
            if(i < substring.length()){
                substring = substring.substring(0,i);
                if(substring.equals("")) return substring;
            }
        }



        return substring;
    }
}
