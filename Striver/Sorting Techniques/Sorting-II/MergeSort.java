import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return nums;
        }
        int mid = (right + left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
        return nums;
    }

    public static int[] merge(int[] nums, int l, int m, int h) {
        int[] temp = new int[h - l + 1];
        int left = l;
        int right = m + 1;
        int index = 0;

        while (left <= m && right <= h) {
            if (nums[left] <= nums[right]) {
                temp[index++] = nums[left++];
            } else {
                temp[index++] = nums[right++];
            }
        }

        while (left <= m) {
            temp[index++] = nums[left++];
        }

        while (right <= h) {
            temp[index++] = nums[right++];
        }

        for (int i = 0; i < temp.length; i++) {
            nums[l + i] = temp[i];
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] arr = {8,3,1,0,66};
        System.out.println(Arrays.toString(mergeSort(arr, 0, 4)));
    }
}