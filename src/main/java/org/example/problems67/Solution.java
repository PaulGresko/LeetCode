package org.example.problems67;

public class Solution {
    public String addBinary(String a, String b) {
        int an = a.length() - 1;
        int bn = b.length() - 1;
        StringBuilder res = new StringBuilder();
        boolean oneMore = false;

        int i = 0;
        while (i <= an && i <= bn) {
            if (a.charAt(an - i) == '1' && b.charAt(bn - i) == '1') {
                if (oneMore) {
                    res.append("1");
                } else {
                    res.append("0");
                }
                oneMore = true;
            } else if ((a.charAt(an - i) == '1' || b.charAt(bn - i) == '1')) {
                if (oneMore) {
                    res.append("0");
                } else {
                    res.append("1");
                }
            } else {
                if (oneMore) {
                    res.append("1");
                } else {
                    res.append("0");
                }
                oneMore = false;
            }
            i++;
        }
        while (i <= an){
            if(oneMore){
                if(a.charAt(an - i) == '1') {
                    res.append("0");
                }
                else {
                    res.append("1");
                    oneMore = false;
                }
            }else {
                res.append(a.charAt(an-i));
            }
            i++;
        }
        while (i <= bn){
            if(oneMore){
                if(b.charAt(bn - i) == '1') {
                    res.append("0");
                }
                else {
                    res.append("1");
                    oneMore = false;
                }
            }else {
                res.append(b.charAt(bn-i));
            }
            i++;
        }
        if(oneMore){
            res.append("1");
        }
        return res.reverse().toString();
    }
}
