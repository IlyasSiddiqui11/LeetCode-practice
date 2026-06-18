import java.util.Arrays;

public class SelectionSort{
    // Look for the smallest value and bring it toits correct position
    public static int[] selectionSort(int[] nums){
        for(int i = 0;i<=nums.length-2;i++){
            int minIndex = i;
            for(int j = i;j<=nums.length-1;j++){
                if (nums[i]>nums[j]) {
                    minIndex = j;
                }
                swap(nums,i,minIndex);
            }
        }
        return nums;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,4,2,7,0};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}