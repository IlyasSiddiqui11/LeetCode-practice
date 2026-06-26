import java.util.Arrays;

public class LeftRotateArraybyOne {
    public static void rotateArrayByOne(int[] nums){
        int a = nums[0];
        for(int i = 1;i<nums.length;i++){
            nums[i-1] = nums[i];
        }
        nums[nums.length-1] = a;
        System.out.println(Arrays.toString(nums));
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotateArrayByOne(arr);
    }
}
