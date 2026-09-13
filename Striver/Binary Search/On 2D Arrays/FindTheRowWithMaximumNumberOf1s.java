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
                    maxCnt = Math.max(maxCnt, cnt);
                    index = i;
                }
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


        System.out.println(rowWithMax1sBrute(matrix, 4, 4));
    }
}