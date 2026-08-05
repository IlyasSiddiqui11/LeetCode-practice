public class HowManyTimesArrayIsRotated {
    public static int findKRotation(int[] nums) {
        int low = 0, high = nums.length - 1, ans = Integer.MAX_VALUE, index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[low] <= nums[high]) {
                if (nums[low] < ans) {
                    index = low;
                    ans = nums[low];
                }
            }
            if (nums[low] <= nums[mid]) {
                if (nums[low] < ans) {
                    index = low;
                    ans = nums[low];
                }
                low = mid + 1;
            }
            else{
                if (nums[mid] < ans) {
                    index = mid;
                    ans = nums[mid];
                }
                high = mid - 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,0,1,2};
        System.out.println(findKRotation(arr));
    }
}
