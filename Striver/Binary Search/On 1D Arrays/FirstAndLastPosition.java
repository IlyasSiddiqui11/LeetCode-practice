import java.util.Arrays;

public class FirstAndLastPosition {
    public static int lowerBound(int[] arr, int x){
        int ans = arr.length;
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x){
                high = mid - 1;
                ans = mid;
            }
            else if (arr[mid] <= x ) {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int upperBound(int[] arr, int x){
        int ans = arr.length;
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] > x){
                high = mid - 1;
                ans = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int[] searchRangeI(int[] nums, int target) {
        int lb = lowerBound(nums, target);
        if (lb == nums.length || nums[lb] != target) {
            return new int[] {-1,-1}; 
        }
        return new int[] {lb, upperBound(nums, target) - 1};
    }

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

    public static int[] searchRange(int[] nums, int target) {
        return new int[] {firstOccurrence(nums, target), lastOccurrence(nums, target)};
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,8,8,11,13};
        System.out.println(Arrays.toString(searchRange(arr, 8)));
    }
}
