package Striver.Arrays.Easy;

public class MissingNumber {
    //Using sum     TC: O(N) SC: O(1)
    public static int missingNumber(int[] nums){
        int sum = nums.length*(nums.length+1)/2;
        int sum2 = 0;
        for(int i = 0; i<nums.length;i++){
            sum2 += nums[i];
        }
        return sum - sum2;
    }
    // Using XOR
    public static int missingNumberXOR(int[] nums){
        int xor1 = 0;
        int xor2 = 0;
        // for(int i = 0;i<=nums.length;i++){
        //     xor1 = xor1 ^ i;
        // }
        for(int i = 0; i<nums.length;i++){
            xor2 = xor2^nums[i];
            xor1 = xor1^(i);
        }
        xor1 = xor1 ^ nums.length;
        return xor1^xor2;
    }

    public static void main(String[] args) {
        int[] arr  = {0,1,2,3,5};
        System.out.println(missingNumberXOR(arr));
        System.out.println();
    }
}
