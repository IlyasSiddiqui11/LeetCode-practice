package Striver.Recursion;

public class CheckIfthereexistsasubsequencewithsumK {
    
    public boolean checkSubsequenceSum(int[] nums, int k) {
        if (nums.length == 0)
            return k == 0;
        return recursive(nums, nums.length - 1, k);
    }

    private boolean recursive(int[] nums, int index, int k) {
        if (k == 0)
            return true;
        if (index == 0) {
            return nums[index] == k;
        }
        boolean take = false;
        boolean notTake = recursive(nums, index - 1, k);
        if (k >= nums[index]) {
            take = recursive(nums, index - 1, k - nums[index]);
        }
        return take || notTake;
    }
}
