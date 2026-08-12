import java.util.Arrays;

public class CapacityToShipPackagesWithinDDays {
    private static int  neededDays(int[] weights, int capacity){
        int sum = 0, days = 1;
        for(int weight : weights){
            if (sum + weight > capacity) {
                days++;
                sum = weight;
            }
            else{
                sum += weight;
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        int ans = high;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if (neededDays(weights, mid) <= days) {
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
