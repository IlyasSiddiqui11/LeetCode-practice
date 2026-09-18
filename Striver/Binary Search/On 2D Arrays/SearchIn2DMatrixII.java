public class SearchIn2DMatrixII {

    // Brute force will be searching linearly in the array. O(n * m)
    // Better solution will be picking every row from the 2D matrix and performing binary search on that row. O(n * log m)

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0;
        int col = m - 1;

        while(row < n && col >= 0){
            if (matrix[row][col] == target) {
                return true;
            }
            else if(matrix[row][col] > target){
                col--;
            } else{
                row++;
            }
        }
        return false;
    }
}
