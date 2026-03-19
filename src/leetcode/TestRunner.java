package leetcode;

import leetcode.matrix.P3212_CountSubmatricesEqualFreqXY;

public class TestRunner {
    public static void main(String[] args) {
        P3212_CountSubmatricesEqualFreqXY sol = new P3212_CountSubmatricesEqualFreqXY();

        System.out.println(sol.numberOfSubmatrices(new char[][]{{'.', 'X'}, {'.', 'Y'}}));
    }
}
