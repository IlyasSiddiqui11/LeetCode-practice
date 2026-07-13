// package Striver.Arrays.Medium;

import java.util.Map;
import java.util.TreeMap;

public class SubarraySumEqualsK {
    // Brute Force Approach
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // public static int subarraySum(int[] nums, int k) {
    //     int count = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         int sum = 0;
    //         for (int j = i; j < nums.length; j++) {
    //             sum += nums[j];
    //             if (sum == k) {
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    public static int subarraySum(int[] nums, int k){
        Map<Integer,Integer> mp = new TreeMap<>();
        int cnt = 0, prefixSum = 0;
        mp.put(0, 1);
        for(int i = 0;i<nums.length;i++){
            prefixSum += nums[i];
            int remove = prefixSum - k;
            if (mp.containsKey(remove)) {
                cnt += mp.get(remove);
            }
            mp.put(prefixSum, mp.getOrDefault(prefixSum,0)+1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
        System.out.println(subarraySum(arr, 3));
    }
}
