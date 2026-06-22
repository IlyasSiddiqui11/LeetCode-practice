package Striver.Arrays.Easy;

import java.util.ArrayList;

public class IfTheArrayIsSorted {
    public boolean isSorted(ArrayList<Integer> nums) {
        for(int i = 1; i < nums.size(); i++){
            if (nums.get(i) < nums.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
