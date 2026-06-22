// package Striver.Arrays.Easy;

public class SecondSmallestElement {
    public static int secondSmallest(int[] nums) {
        int secondSmallest = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest) {
                secondSmallest = smallest;
                smallest = nums[i];
            } else if (nums[i] != smallest && nums[i] < secondSmallest) {
                secondSmallest = nums[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 2, 5 };
        System.out.println(secondSmallest(arr));
    }
}
