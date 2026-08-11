public class MinimumNumberofDaystoMakemBouquets {
    private static boolean isPossible(int[] bloomDay, int day, int m, int k){
        int cnt = 0, bouquet = 0;
        for(int i = 0; i < bloomDay.length; i++){
            if (bloomDay[i] <= day) {
                cnt++;
            }
            else{
                bouquet += (cnt / k);
                cnt = 0;
            }
        }
        bouquet += (cnt / k);
        return bouquet >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < (long) m * k) return -1;
        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;
        for (int bloom : bloomDay) {
            minDay = Math.min(minDay, bloom);
            maxDay = Math.max(maxDay, bloom);
        }
        int low = minDay, high = maxDay, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(bloomDay, mid, m, k) == true) {
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
