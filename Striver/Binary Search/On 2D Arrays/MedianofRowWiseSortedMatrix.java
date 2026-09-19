import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianofRowWiseSortedMatrix {

    public int findMedianBrute(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> ls = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                ls.add(matrix[i][j]);
            }
        }
        Collections.sort(ls);
        return ls.get((n*m)/2);
    }

    public static int findMedian(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = matrix[0][0];
        int high = matrix[0][cols - 1];

        for(int i = 1; i < rows; i++){
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][cols - 1]);
        }
        int target = (rows * cols) / 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int smallerOrEqual = smallerOrEqual(matrix,mid);
            if (smallerOrEqual <= target) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }

    private static int smallerOrEqual(int[][] matrix,int x){
        int m = matrix[0].length;
        int num = 0;
        for(int i = 0; i < m; i++){
            num += upperBound(matrix[i], x);
        }
        return num;
    }

    public static int upperBound(int[] arr, int x){
        int ans = arr.length;
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] > x){
                high = mid - 1;
                ans = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 3, 5},
            {2, 6, 9},
            {3, 6, 9}
        };
        System.out.println(findMedian(matrix));
    }
}