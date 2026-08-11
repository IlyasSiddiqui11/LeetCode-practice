import java.util.Arrays;

public class FindtheSmallestDivisor {
    private static int sumByD(int[] nums, int div){
        int sum = 0;
        for(int num : nums){
            sum += Math.ceil((double)num / div);
        }
        return sum;
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        int maxValue = Arrays.stream(nums).max().getAsInt();
        int low = 1, high = maxValue;
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

    public static void main(String[] args) {
        int[] arr = {1,2,5,11};
        System.out.println(smallestDivisor(arr, 6));
    }
}
