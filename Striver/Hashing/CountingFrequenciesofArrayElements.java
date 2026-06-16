package Striver.Hashing;

import java.util.HashMap;
import java.util.List;

public class CountingFrequenciesofArrayElements {
    public static HashMap<Integer,Integer> countFrequencies(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            int key = nums[i];
            map.put(key, map.getOrDefault(key,0)+1);
        }
        return map;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,44,5};
        System.out.println(countFrequencies(arr));

    }
}
