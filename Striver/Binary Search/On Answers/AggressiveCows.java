import java.util.Arrays;

public class AggressiveCows {
    private static boolean canWePlace(int[] stalls, int cows, int distance){
        int cntCows = 1, last = stalls[0];
        for (int i = 1; i < stalls.length - 1; i++) {
            if (stalls[i] - last >= distance) {
                cntCows++;
                last = stalls[i];
            }
            if (cntCows >= cows) {
                return true;
            }
        }
        return false;
    }
    public static int aggressiveCowsBrute(int[] stalls, int cows){
        Arrays.sort(stalls);
        int max = stalls[stalls.length - 1] - stalls[0];
        int min = 1;
        for(int i = 1; i < max - min; i++){
            if (canWePlace(stalls, cows, i)) {
                continue;
            }
            else return i - 1;
        }
        return max;
    }

    public static int aggressiveCows(int[] stalls, int cows){
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canWePlace(stalls, cows, mid)) {
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] stalls = {1, 2, 8, 4, 9};

        int cows = 3;
        System.out.println(aggressiveCows(stalls, cows));
    }
}
