import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    // Better than brute: USING HASHMAP
    // TC: O(2N)    SC: O(N)
    // public static int singleNumber(int[] nums) {
    //     int ans = -1;
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         int key = nums[i];
    //         map.put(key, map.getOrDefault(key, 0) + 1);
    //     }
    //     for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    //         if (entry.getValue() == 1) {
    //             ans = entry.getKey();
    //         }
    //     }
    //     return ans;
    // }

    // Optimal
    // TC: O(N) SC: O(1)
    public static int singleNumber(int[] nums){
        int xor = 0;
        for(int i = 0;i<nums.length;i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }


    public static void main(String[] args) {
        int[] arr = {2,2,1};
        System.out.println(singleNumber(arr));
    }
}
