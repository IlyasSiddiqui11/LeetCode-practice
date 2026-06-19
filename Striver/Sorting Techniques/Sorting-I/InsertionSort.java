import java.util.Arrays;

public class InsertionSort {
    //Time Complexity is O(N^2)
    //Take an element and place it to its correct position
    public static int[] insertionSort(int [] nums){
        for(int i = 0; i<=nums.length-1;i++){
            int j = i;
            while (j>0 && nums[j-1]>nums[j]) {
                swap(nums, j-1, j);
                j--;
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
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
