public class FindTheRowWithMaximumNumberOf1s {
    public static int rowWithMax1sBrute(int[][] matrix, int n, int m) {
        int maxCnt = 0, index = -1;
        for(int i = 0; i < n; i++){
            int cnt = 0;
            for(int j = 0; j < m; j++){
                if (matrix[i][j] == 1) {
                    cnt++;
                }
                if (cnt > maxCnt) {
                    maxCnt = cnt;
                    index = i;
                }
            }
        }
        return index;
    }

    public static int lowerBound(int[] arr, int x){
        int ans = arr.length;
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x){
                high = mid - 1;
                ans = mid;
            }
            else if (arr[mid] <= x ) {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int rowWithMax1s(int[][] matrix, int n, int m){
        int maxCnt = 0, index = -1;
        for(int i = 0; i < n; i++){
            int cnt = m - lowerBound(matrix[i], 1);
            if (cnt > maxCnt) {
                maxCnt = cnt;
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 1, 1},
                {0, 1, 1, 1},
                {0, 0, 0, 1},
                {1, 1, 1, 1}
        };


        System.out.println(rowWithMax1s(matrix, 4, 4));
    }
}