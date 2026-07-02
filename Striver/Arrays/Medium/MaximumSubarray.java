package Striver.Arrays.Medium;

import java.util.Arrays;

public class MaximumSubarray {
    public static int[] maxSubarray(int[] arr){
        int max = Integer.MIN_VALUE, sum = 0;
        int ansStart = -1,ansEnd = -1, start = 0; // This is for returning the maxSubarray
        for(int i = 0;i<arr.length;i++){
            if (sum == 0) start = i; // This is for returning the maxSubarray
            sum += arr[i];
            if (sum>max) {
                max = sum;
                ansStart = start; // This is for returning the maxSubarray
                ansEnd = i; // This is for returning the maxSubarray
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        // return max; 
        return new int[]{ansStart, ansEnd}; // This is for returning the maxSubarray
    }

    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(Arrays.toString(maxSubarray(arr)));
    }
}
