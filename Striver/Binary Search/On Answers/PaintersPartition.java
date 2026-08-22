import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaintersPartition{
    public static int paintersPartition(ArrayList<Integer> arr, int k){
        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();
        if (arr.size() < k) {
            return -1;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (cntPainters(arr, mid) > k) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }
    private static int cntPainters(ArrayList<Integer> arr, int painters){
        int cntpainters = 1;
        long noOfPaints = 0;
        for(int i = 0; i < arr.size(); i++){
            if (noOfPaints + arr.get(i) <= painters) {
                noOfPaints += arr.get(i);
            }
            else{
                cntpainters++;
                noOfPaints = arr.get(i);
            }
        }
        return cntpainters; 
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(10,20,30,40));
        System.out.println(paintersPartition(list, 2));
    }
}