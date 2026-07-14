// package Striver.Arrays.Hard;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int nCr(int row, int column) {
        // Brute
        int n = row - 1;
        int r = column - 1;
        // return factorial(n)/(factorial(r)*factorial(n - r));

        // Better
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }

        return res;
    }

    public static List<Integer> generate2(int row) {
        List<Integer> result = new ArrayList<>();
        // Brute
        // for(int c = 1;c<=row;c++){
        // System.out.println(nCr
        // (row, c));
        // }

        int ans = 1;
        result.add(ans);
        for (int i = 1; i < row; i++) {
            ans = (ans * (row - i)) / i;
            result.add(ans);
        }
        return result;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for (int row = 1; row <= numRows; row++) {
            ans.add(generate2(row));
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(generate(5));

    }
}