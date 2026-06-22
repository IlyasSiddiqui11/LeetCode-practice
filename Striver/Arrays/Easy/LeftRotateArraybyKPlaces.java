package Striver.Arrays.Easy;

import java.util.Arrays;

public class LeftRotateArraybyKPlaces {
    public static int[] rotateArray(int[] nums, int k){
        k = k % nums.length;
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        reverse(nums, 0, nums.length-1);

        return nums;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] nums, int start, int end){
        while (start<=end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(rotateArray(arr, 5)));
    }
}
