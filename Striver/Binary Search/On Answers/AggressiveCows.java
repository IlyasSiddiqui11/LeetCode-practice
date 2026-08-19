import java.util.Arrays;

public class AggressiveCows {
    private boolean canWePlace(int[] stalls, int cows, int distance){
        int cntCows = 1, last = stalls[0];
        for (int i = 1; i < stalls.length - 1; i++) {
            if (stalls[i] - last >= distance) {
                cntCows++;
                last = stalls[i];
            }
        }
        return cntCows >= cows;
    }
    public int aggressiveCowsBrute(int[] stalls, int cows){
        Arrays.sort(stalls);
        int max = Arrays.stream(stalls).max().getAsInt();
        int min = Arrays.stream(stalls).min().getAsInt();
        for(int i = 1; i < max - min; i++){
            if (canWePlace(stalls, cows, i)) {
                continue;
            }
            else return i - 1;
        }
        return max;
    }
}
