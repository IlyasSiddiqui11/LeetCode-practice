import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArrays {
    public static List<Integer> unionArray(int[] arr1, int[] arr2){
        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        while (i<arr1.length && j<arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (union.isEmpty() || union.get(union.size()-1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            }
            else  {
                if (union.isEmpty() || union.get(union.size()-1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        // Add remaining elements
        while (i<arr1.length) {
            if (union.get(union.size()-1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }
        while (j<arr2.length) {
            if (union.get(union.size()-1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }
        return union;
    }
    public static void main(String[] args) {
        int[] arr1 = {0,1,1,2,3,4};
        int arr2[] = {1,2,3,4,5};
        System.out.println(unionArray(arr1, arr2));
    }
}
