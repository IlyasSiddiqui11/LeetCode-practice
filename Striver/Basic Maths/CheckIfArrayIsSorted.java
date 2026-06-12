public class CheckIfArrayIsSorted {
    public static boolean check(int[] nums){
        for(int i = 1; i < nums.length; i++){
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {4,1, 2, 4, 5};
        System.out.println(check(nums));
    }
}
