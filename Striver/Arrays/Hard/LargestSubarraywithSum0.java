import java.util.HashMap;

public class LargestSubarraywithSum0 {
    public static int subarrayWithSum0(int[] arr){
        int max =0;
        int prefixSum = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, -1);

        for(int i = 0; i < arr.length; i++){
            prefixSum += arr[i];
            if (mpp.containsKey(prefixSum)) {
                max = Math.max(max, i - mpp.get(prefixSum));
            } else {
                mpp.put(prefixSum, i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,-1,3,2,-2,-8,1,7,10,23};
        System.out.println(subarrayWithSum0(arr));
    }
}
