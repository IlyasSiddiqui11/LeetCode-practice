package Striver.Recursion;

import java.util.Arrays;

public class ReverseAnArray {
    public static int[] reverseArray(int [] nums,int l,int r){
        if (l>=r) {
            return nums;
        }
        swap(nums, l, r);
        reverseArray(nums, l+1, r-1);
        return nums;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new int[]{1,2,3}, 0, 2)));
    }
}
