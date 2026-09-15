public class SearchinA2DMatrix {
    
    public boolean searchMatrixBetter(int[][] matrix, int target) {
        for(int i = 0; i < matrix[0].length-1; i++){
            if (matrix[i][0] < target && matrix[i][matrix.length - 1] > target) {
                return search(matrix[i], target);
            }
        }
        return false;
    }

    public static boolean search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return true;
            else if (nums[mid] > target) {
                high = mid - 1;
            } 
            else{
                low = mid + 1;
            }
        }
        return false;
    }
}
