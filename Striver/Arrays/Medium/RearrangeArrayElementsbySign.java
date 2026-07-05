// package Striver.Arrays.Medium;

import java.util.Arrays;

public class RearrangeArrayElementsbySign {
    // public static int[] rearrangeArray(int[] nums) {
    //     int[] pos = new int[nums.length / 2];
    //     int[] neg = new int[nums.length / 2];
    //     int p = 0, q = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] > 0) {
    //             pos[p] = nums[i];
    //             p++;
    //         } else {
    //             neg[q] = nums[i];
    //             q++;
    //         }
    //     }
    //     for (int i = 0; i < nums.length / 2; i++) {
    //         nums[2 * i] = pos[i];
    //         nums[2 * i + 1] = neg[i];
    //     }
    //     return nums;
    // }
    public static int[] rearrangeArray(int[] nums){
        int[] ans = new int[nums.length];
        int p = 0, q = 1;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] > 0) {
                ans[p] = nums[i];
                p+=2;
            }else{
                ans[q] = nums[i];
                q+=2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, -2, -5, 2, -4 };
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
}
