import java.util.Arrays;

public class KokoEatingBananas {
    private static long totalHours(int[] piles, int hourly) {
        long totalHours = 0;
        for (int pile : piles) {
            totalHours += (int) Math.ceil((double) pile / hourly);
        }
        return totalHours;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int maxPile = Arrays.stream(piles).max().getAsInt();
        
        int low = 1, high = maxPile, ans = maxPile;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (totalHours(piles, mid) <= h) {
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid  + 1;
            }
        }
        return ans;
    }
}
