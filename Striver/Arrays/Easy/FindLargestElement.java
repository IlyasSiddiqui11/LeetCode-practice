package Striver.Arrays.Easy;


public class FindLargestElement {

    public static int largestElement(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 7, 3, 24, 3 };
        System.out.println(largestElement(arr));
    }
}
