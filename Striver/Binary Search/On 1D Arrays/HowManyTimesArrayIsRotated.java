public class HowManyTimesArrayIsRotated {
    public int findKRotation(int[] nums) {
        int start = 0, end = nums.length - 1, ans = Integer.MAX_VALUE, index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[start] <= nums[end]) {
                if (nums[start] < ans) {
                    index = start;
                    ans = nums[start];
                }
            }
            if (nums[start] <= nums[mid]) {
                if (nums[start] < ans) {
                    index = start;
                    ans = nums[start];
                }
                start = mid + 1;
            }
            else{
                if (nums[mid] < ans) {
                    index = mid;
                    ans = nums[mid];
                }
                end = mid - 1;
            }
        }
        return index;
    }
}
