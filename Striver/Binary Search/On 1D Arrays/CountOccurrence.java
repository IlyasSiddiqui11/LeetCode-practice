public class CountOccurrence {
    private static int firstOccurrence(int[] nums, int target){
        int first = -1;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                high = mid - 1;
                first = mid;
            } 
            else if (nums[mid] > target) {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return first;
    }

    private static int lastOccurrence(int[] nums, int target){
        int last = -1;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                low = mid + 1;
                last = mid;
            } 
            else if (nums[mid] > target) {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return last;
    }

    public static int numberOfOccurrence(int[] nums, int target){
        return lastOccurrence(nums, target) - firstOccurrence(nums, target) + 1;
    }
}
