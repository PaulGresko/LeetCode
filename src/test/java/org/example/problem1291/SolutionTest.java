package org.example.problem1291;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sequentialDigits1() {
        int low = 100, high = 300;
        List<Integer> expected = new ArrayList<>();
        expected.add(123);expected.add(234);
        assertIterableEquals(expected, new Solution().sequentialDigits(low, high));
    }

    @Test
    void sequentialDigits2() {
        int low = 1000, high = 13000;
        List<Integer> expected = new ArrayList<>();
        expected.add(1234);expected.add(2345);expected.add(3456);expected.add(4567);expected.add(5678);expected.add(6789);expected.add(12345);
        assertIterableEquals(expected, new Solution().sequentialDigits(low, high));
    }
}