package Striver.Arrays.Medium;

import java.util.HashSet;

public class LongestConsecutiveSequenceInAnArray {

    // OPTIMAL
    public static int longestConsecutive(int [] nums){
        int cnt = 0, longest = 1;

        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for (Integer it : set) {
            if (!set.contains(it-1)) {
                cnt = 1;
                int x = it;
                while (set.contains(x+1)) {
                    cnt++;
                    x++;
                }
            }
            longest = Math.max(longest, cnt);
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] arr  = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
}
