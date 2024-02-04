package org.example.problem349;

import java.util.*;
import java.util.stream.Collectors;


public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        set = Arrays.stream(nums2)
                .filter(set::contains)
                .boxed()
                .collect(Collectors.toSet());
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
