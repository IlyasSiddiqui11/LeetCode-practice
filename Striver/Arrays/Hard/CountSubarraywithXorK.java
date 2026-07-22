import java.util.HashMap;

public class CountSubarraywithXorK {
    public static int subarrayXorK(int[] arr, int k){
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int prefixXor = 0, cnt = 0;
        mpp.put(0, 1);
        for(int i = 0; i < arr.length; i++){
            prefixXor ^= arr[i];
            int x = prefixXor^k;
            if (mpp.containsKey(x)) {
                cnt += mpp.get(x);
            }
            mpp.put(prefixXor, mpp.getOrDefault(prefixXor, 0)+1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        System.out.println(subarrayXorK(arr, 0));
    }
} 
