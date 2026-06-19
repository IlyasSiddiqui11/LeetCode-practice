import java.util.Arrays;

//Time Complexity O(N) for the best case. As it exits if the array is already sorted.
// O(N^2) for worst and average case 
public class RecursiveBubbleSort {
    public static void bubbleSort(int[] nums, int length){
        int swapHappened=0;
        if (length <= 1) {
            return;
        }
        for(int j = 0;j<=length-2;j++){
            if (nums[j]>nums[j+1]) {
                swap(nums, j+1, j);
                swapHappened = 1;
            }
        }
        if(swapHappened == 0) return;

        bubbleSort(nums,length-1);
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {9, 2, 3, 1, 7, 0};
        bubbleSort(nums, nums.length);
        System.out.println(Arrays.toString(nums));
    }
}
