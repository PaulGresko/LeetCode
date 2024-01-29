package org.example.problem1689;


public class Solution {
    public int minPartitions(String n) {
        return n.chars().max().getAsInt() - 48;
    }
}
