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

    public static int[] searchRange(int[] nums, int target) {
        int lb = lowerBound(nums, target);
        if (lb == nums.length || nums[lb] != target) {
            return new int[] {-1,-1}; 
        }
        return new int[] {lb, upperBound(nums, target) - 1};
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,8,8,11,13};
        System.out.println(Arrays.toString(searchRange(arr, 8)));
    }
}
