package Striver.Arrays.Medium;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class TwoSum {
    public static String twoSum(int arr[], int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] == target) {
                return "Yes";
            }
            if (arr[left] + arr[right] < target) {
                left++;
            } else if (arr[left] + arr[right] > target) {
                right--;
            }
        }
        return "No";
    }

    public static int[] twoSumII(int[] arr, int target) {
        Map<Integer, Integer> mpp = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (mpp.containsKey(target - arr[i])) {
                return new int[] { mpp.get(target - arr[i]), i };
            }
            mpp.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 8, 11 };
        System.out.println(twoSum(arr, 14));
    }
}
