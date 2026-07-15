import java.util.ArrayList;
import java.util.List;

public class MajorityElementsII {

    // Brute Force
    public static List<Integer> majorityElement(int[] nums) {
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

    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,2,2,2};
        System.out.println(majorityElement(arr));
    }
}
