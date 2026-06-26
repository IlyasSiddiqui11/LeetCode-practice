import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LongestSubArrayWithSumK {

    // 
    public static int longestSubArrayWithSumK(int[] arr, int k) {
        int sum = 0;
        int len = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == k) {
                len = Math.max(len, i + 1);
            }
            int rem = sum - k;
            if (map.containsKey(rem)) {
                len = Math.max(len, i - map.get(rem));
            }
            // map.put(sum, i); THIS IS FOR POSITIVE INTEGERS ONLY.
            map.putIfAbsent(sum, i); // Also does for 0s and negatives.
        }
        return len;
    }

    // Only for positives
    public static int longestSubArrayWithSumKII(int[] arr,int k){
        int len = 0;
        int left= 0,right =0;
        int sum = arr[0];
        while (right < arr.length) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                len = Math.max(len, right -left + 1);
            }
            right++;
            if(right < arr.length) sum = sum + arr[right];
        }
        return len;
    }



    public static void main(String[] args) {
        int[] arr = {2,0,0,0,3};
        System.out.println(longestSubArrayWithSumKII(arr, 3));
    }
}