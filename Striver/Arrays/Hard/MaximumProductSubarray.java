public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int prefix = 1, suffix = 1;
        for(int i = 0; i < nums.length; i++){
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix *= nums[i];
            suffix *= nums[nums.length - i - 1];

            max = Math.max(max, Math.max(prefix, suffix));
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2,3,4,-1,0,-2,3,1,4,0,4,6,-1,4};
        System.out.println(maxProduct(arr));
    }
}
