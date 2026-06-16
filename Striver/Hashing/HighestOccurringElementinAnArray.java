package Striver.Hashing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HighestOccurringElementinAnArray {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int maxKey = Collections.max(map.entrySet(),
                Map.Entry.comparingByValue()).getKey();

        // System.out.println("Key with max value: " + maxKey);
        return maxKey;
    }
}
