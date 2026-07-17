import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class MajorityElementsII {

    // Brute Force
    public static List<Integer> majorityElementBrute(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(ls.size() == 0 || ls.get(0) != nums[i]){
                int cnt = 0;
                for(int j = 0; j < nums.length; j++){
                    if (nums[j] == nums[i]) {
                        cnt++;   
                    }
                }
                if (cnt > nums.length/3) {
                    ls.add(nums[i]);
                }
            }
            if (ls.size() == 2) {
                break;
            }
        }
        return ls;
    } 

    public static List<Integer> majorityElementBetter(int[] nums){
        List<Integer> ls = new ArrayList<>();
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int minimum = (nums.length/ 3) + 1;
        for(int i = 0; i < nums.length; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
            if (mpp.get(nums[i]) == minimum) {
                ls.add(nums[i]);
            }
            if(ls.size() == 2){
                break;
            }
        }
        return ls;
    }

    public static List<Integer> majorityElement(int[] nums){
        List<Integer> ls = new ArrayList<>();
        int cnt1 = 0, cnt2 =  0, el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i ++){
            if(cnt1 == 0 && nums[i] != el2){
                el1 = nums[i];
                cnt1 = 1;
            }
            else if(cnt2 == 0 && nums[i] != el1){
                el2 = nums[i];
                cnt2 = 1;
            }
            else if (nums[i] == el1) {
                cnt1++;
            }
            else if (nums[i] == el2) {
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }    
        }
        cnt1 = 0 ; cnt2 = 0 ;
        for(int num : nums){
            if (num == el1) {
                cnt1++;
            }
            if (num == el2) {
                cnt2++;
            }
        }
        if (cnt1 > nums.length/3) {
            ls.add(el1);
        }
        if (cnt2 > nums.length/3) {
            ls.add(el2);
        }
        return ls;
    }


    public static void main(String[] args) {
        int[] arr = {1,1,1,3,2,2,2};
        System.out.println(majorityElement(arr));
    }
}
