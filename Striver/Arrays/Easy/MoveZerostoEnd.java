import java.util.Arrays;

public class MoveZerostoEnd {
    public static void moveZeroes(int[] nums) {
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1)
            return;

        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, i, j);
                j++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 0, 2, 1 };
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
