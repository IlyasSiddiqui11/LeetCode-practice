package LeetCode;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0];
    }
}
