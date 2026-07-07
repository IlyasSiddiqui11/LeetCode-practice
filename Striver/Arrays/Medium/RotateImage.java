package Striver.Arrays.Medium;

public class RotateImage {
    public static int[][] rotateImage(int[][] matrix) {
        int n = matrix.length;
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][n - 1 - i] = matrix[i][j];
            }
        }
        return ans;
    }

    private static void swap(int[][] matrix, int i, int j, int x, int y) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[x][y];
        matrix[x][y] = temp;
    }

    public static int[][] rotateImageOptimal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                swap(matrix, i, j, j, i);
            }
        }
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            int left = 0;
            int right = col - 1;
            while (left < right) {
                swap(matrix, i, left, i, right);
                left++;
                right--;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        System.out.println(java.util.Arrays.deepToString(rotateImageOptimal(matrix)));
    }
}
