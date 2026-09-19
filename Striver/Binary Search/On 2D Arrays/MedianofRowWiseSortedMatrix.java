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
        return ls.get((n+m)/2);
    }
}