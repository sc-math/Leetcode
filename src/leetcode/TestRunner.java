package leetcode;

import leetcode.matrix.P1727_LargestSubmatrixWithRearrangements;

public class TestRunner {
    public static void main(String[] args) {
        P1727_LargestSubmatrixWithRearrangements sol = new P1727_LargestSubmatrixWithRearrangements();

        System.out.println(sol.largestSubmatrix(new int[][]{{0,0,1}, {1,1,1}, {1,0,1}}));
    }
}
