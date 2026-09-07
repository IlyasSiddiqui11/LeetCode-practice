import java.util.PriorityQueue;

public class MinimizeMaxDistancetoGasStation {
    public double minimiseMaxDistanceBrute(int[] arr, int k) {
        int[] howMany = new int[arr.length - 1];
        
        for(int gasS = 1; gasS < k; gasS++){
            double maxSecLen = -1;
            int maxInd = -1;
            for(int i = 0;i < arr.length - 1; i++){
                double diff = arr[i + 1] - arr[i];
                double secLen = diff / (double) howMany[i] + 1.0;
                if (secLen > maxSecLen) {
                    maxInd = i;
                    maxSecLen = secLen;
                }
            }
            howMany[maxInd]++;
        }
        
        double maxAns = -1;
        for(int i = 0; i < arr.length - 1; i++){
            int diff = arr[i + 1] - arr[i];
            double secLen = diff / (double) howMany[i] + 1.0;
            maxAns = Math.max(maxAns, secLen);
        }
        return maxAns;
    }

    // Priority Queue
    public double minimiseMaxDistanceBetter(int[] arr, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Double.compare(a.distance, b.distance));
        int[] howMany = new int[arr.length - 1];
        for(int i = 0; i < arr.length - 1; i++){
            pq.add(new Pair(arr[i = 1] - arr[i], i));
        }
        for(int gasS = 1; gasS <= k; gasS++){
            Pair top = pq.poll();
            int ind = top.index;
            howMany[ind]++;

            double totalDiff = arr[ind + 1] - arr[ind];
            double newDist = totalDiff / (howMany[ind] + 1);
            pq.add(new Pair(newDist, ind));
        }

        return pq.peek().distance;
    }

    // Binary Search
    private static int noOfGasStationsRequired(int[] arr, double dist){
        int cnt = 0;

        for (int i = 1; i < arr.length; i++) {
            int numberInBetween = (int) ((arr[i] - arr[i - 1]) / dist);
            if ((arr[i] - arr[i - 1]) == (dist * numberInBetween)) {
                numberInBetween--;
            }
            cnt += numberInBetween;
        }

        return cnt;
    }

    public double minimiseMaxDistance(int[] arr, int k) {
        int n = arr.length;
        double low = 0, high = 0;

        for (int i = 0; i < n - 1; i++) {
            high = Math.max(high, arr[i + 1] - arr[i]);
        }

        double diff = 1e-6;

        while (high - low > diff) {
            double mid = (low + high) / 2.0;
            int count = noOfGasStationsRequired(arr, mid);

            if (count > k) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return high;

    }


    public static void main(String[] args) {
        
    }
}
class Pair {
    double distance;
    int index;

    Pair(double distance, int index) {
        this.distance = distance;
        this.index = index;
    }
}