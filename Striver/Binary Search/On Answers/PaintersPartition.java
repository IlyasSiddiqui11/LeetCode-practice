import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PaintersPartition{
    public static int paintersPartition(int[] arr, int k){
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        if (arr.length < k) {
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
    private static int cntPainters(int[] arr, int painters){
        int cntpainters = 1;
        long noOfPaints = 0;
        for(int i = 0; i < arr.length; i++){
            if (noOfPaints + arr[i] <= painters) {
                noOfPaints += arr[i];
            }
            else{
                cntpainters++;
                noOfPaints = arr[i];
            }
        }
        return cntpainters; 
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(10,20,30,40));
        System.out.println(paintersPartition(list, 2));
    }
}