package Striver.Arrays.Easy;

import java.util.ArrayList;

public class IfTheArrayIsSorted {
    public static boolean isSorted(ArrayList<Integer> nums) {
        for(int i = 1; i < nums.size(); i++){
            if (nums.get(i) < nums.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3};
        ArrayList<Integer> arrr = new ArrayList<>();
        for (int num : arr) {
            arrr.add(num);
        }
        System.out.println(isSorted(arrr));
    }
}
