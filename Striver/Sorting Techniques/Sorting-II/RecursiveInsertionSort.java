import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void insertionSort(int[] nums, int length, int i){
        if (length == i) return;
        int j = i;
        while (j > 0 && nums[j-1]>nums[j]) {
            swap(nums, j, j-1);
            j--;
        }

        insertionSort(nums, length, i+1);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,1,5,8,9,0,1};
        insertionSort(arr, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }
}
