import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int a = 0; a < nums.length; a++){
            if (a > 0 && nums[a] == nums[a - 1]) continue;
            for(int b = a + 1; b < nums.length; b++){
                if (b > a + 1 && nums[b] == nums[b - 1]) continue;
                int c = b + 1;
                int d = nums.length - 1;
                while(c < d){
                    long sum = (long) nums[a] + nums[b] + nums[c] + nums[d];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[a],nums[b],nums[c],nums[d]));
                        c++;
                        d--;

                        while(c < d && nums[c] == nums[c - 1]) c++;
                        while(c < d && nums[d] == nums[d + 1]) d--;
                    }
                    else if (sum < target) c++;
                    else d--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,3,4,4,4,5,5};
        System.out.println(fourSum(arr, 8));
    }
}
