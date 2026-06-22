package Striver.Arrays.Easy;

public class SecondLargestElement {
    // Time Complexity O(2N)
    // Needs 2 passes 
    public static int secondLargest(int[] nums){
        int secondLargest = -1;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        for(int j = 0;j<nums.length;j++){
            if (nums[j]>secondLargest && nums[j]<max) {
                secondLargest = nums[j];
            }
        }
        return secondLargest;
    }

    // Time Complexity O(N)
    // Done only in one pass.
    public static int secondLargestII(int[] nums){
        int secondLargest = -1;
        int max = nums[0];
        for(int i = 1;i<nums.length;i++){
            if (nums[i]>max) {
                secondLargest = max;
                max = nums[i];
            }
            else if (nums[i]<max && nums[i]>secondLargest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,6,2,5};
        System.out.println(secondLargestII(arr));
    }
}
