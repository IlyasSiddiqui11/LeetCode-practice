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