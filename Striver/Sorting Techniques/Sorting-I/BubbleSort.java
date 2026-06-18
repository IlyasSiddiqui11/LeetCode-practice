import java.util.Arrays;

public class BubbleSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Adjacent swaps
    public static int[] bubbleSort(int[] nums){
        for(int i = nums.length-1;i>=1;i--){
            for(int j = 0;j<=i-1;j++){
                if (nums[j]>nums[j+1]) {
                    swap(nums, j, j+1);
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] arr ={3,55,2,1,0};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
