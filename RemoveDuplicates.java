package LeetCode;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicatesII(int[] nums) {
        int p = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[p - 2] != nums[i]) {
                nums[p] = nums[i];
                p++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return p;
    }

    public static int removeDuplicates(int[] nums) {
        int p = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[p]) {
                p++;
                nums[p] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return p + 1;
    }

    public static int removeElement(int[] nums, int val) {
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[p] = nums[i];
                p++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(nums, p)));
        return p;
    }
}
