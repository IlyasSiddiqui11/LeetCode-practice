public class KthMissingPositiveNumber {
    public static int findKthPositiveBrute(int[] arr, int k) {
        for (int i : arr) {
            if (i <= k) {
                k++;
            }
            else break;
        }
        return k;
    }

    public static int findKthPositive(int[] arr, int k){
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return high + 1 + k;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,10,12};
        System.out.println(findKthPositive(arr, 6));
    }
}
