public class FindtheSmallestDivisor {
    private static int sumByD(int[] nums, int div){
        int sum = 0;
        for(int num : nums){
            sum += Math.ceil((double)num / div);
        }
        return sum;
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int num : nums) {
            minValue = Math.min(minValue, num);
            maxValue = Math.max(maxValue, num);
        }
        int low = minValue, high = maxValue;
        int ans = maxValue;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sumByD(nums, mid) <= threshold) {
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
