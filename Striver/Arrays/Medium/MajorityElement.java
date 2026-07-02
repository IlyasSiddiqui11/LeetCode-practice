package Striver.Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {



    // TC: O(N Log N) SC:O(1)
    //  public static int majorityElement(int[] nums) {
    //     Arrays.sort(nums);
    //     int  i = nums.length;
    //     return nums[i/2];
    // }

    // Using HashMap TC: O(N) SC:O(N)
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int i = nums.length;
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) >= i / 2) {
                return num;
            }
        }
        return -1;
    }

    // Moore's Voting Algorithm
    public static int majorityElementMooreVoting(int[] nums){
        int count = 0;
        int el = 0;
        for(int num : nums){
            if(count == 0){
                el = num;
            }
            if(num == el){
                count++;
            }else{
                count--;
            }
        }
        for(int num : nums){
            if(num == el){
                count++;
            }
        }
        if(count > nums.length/2){
            return el;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElementMooreVoting(nums));
    }
}
