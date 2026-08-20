import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookAllocationProblem {
    private static int cntStudents(ArrayList<Integer> arr, int pages){
        int cntStu = 1;
        long studentPages = 0;
        for(int i = 0; i < arr.size(); i++){
            if (studentPages + arr.get(i) <= pages) {
                studentPages += arr.get(i);
            }
            else{
                cntStu++;
                studentPages = arr.get(i);
            }
        }
        return cntStu;
    }
    public static int findPagesBrute(ArrayList<Integer> arr, int n, int m){
        if (n < m) {
            return -1;
        }
        int max = Collections.max(arr);
        int sum = arr.stream().mapToInt(Integer::intValue).sum();
        for(int i = max; i < sum; i++){
            if (cntStudents(arr, i) == m) {
                return i;
            }
        }
        return sum;
    }

    public static int findPages(ArrayList<Integer> arr, int n, int m){
        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();
        if (n < m) {
            return -1;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (cntStudents(arr, mid) > m) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(25,46,28,49,24));
        int n = list.size();
        int students = 4;
        System.out.println(findPages(list, n, students));
    }
}
