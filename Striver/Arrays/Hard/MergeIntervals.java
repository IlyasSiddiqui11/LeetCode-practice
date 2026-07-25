import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] mergeBrute(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int[]> ans = new ArrayList<>();
        int i = 0;
        while (i<intervals.length) {
            int j = i + 1;
            int start = intervals[i][0];
            int end = intervals[i][1];
            while (j < intervals.length && intervals[j][0] <= end) {
                end = Math.max(intervals[j][1], end);
                j++;
            }
            ans.add(new int[]{start,end});
            i = j;
        }
        return ans.toArray(new int[ans.size()][]);
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);

    // SAME as FOR loop
        // int i = 1;
        // while (i < intervals.length) {
        //     int[] last = ans.get(ans.size() - 1);
        //     if (last[1] >= intervals[i][0]) {
        //         last[1] = Math.max(last[1], intervals[i][1]);
        //         i++;
        //     } else {
        //         ans.add(intervals[i]);
        //         i++;
        //     }
        // }
        
        for(int i = 1; i<intervals.length;i++){
            int[] last = ans.get(ans.size() - 1);
            if (last[1] >= intervals[i][0]) {
                last[1] = Math.max(last[1], intervals[i][1]);
            } else {
                ans.add(intervals[i]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(arr)));
    }
}
