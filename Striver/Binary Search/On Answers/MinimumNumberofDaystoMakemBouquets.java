import java.util.Arrays;

public class MinimumNumberofDaystoMakemBouquets {
    private static boolean possible(int[] bloomDay, int day, int m, int k){
        int cnt = 0, noAdjFlowers = 0;
        for(int i = 0; i < bloomDay.length; i++){
            if (bloomDay[i] <= day) {
                cnt++;
            }
            else{
                noAdjFlowers += (cnt / k);
                cnt = 0;
            }
        }
        noAdjFlowers += (cnt / k);
        if (noAdjFlowers >= m) return true;
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int maxDay = Arrays.stream(bloomDay).max().getAsInt();
        if(bloomDay.length < (long) m * k) return -1;
        int low = 1, high = maxDay;
        int ans = maxDay;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(bloomDay, mid, m, k) == true) {
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
