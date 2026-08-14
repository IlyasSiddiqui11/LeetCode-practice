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

    public static void main(String[] args) {
        int[] arr = {5,7,10,12};
        System.out.println(findKthPositiveBrute(arr, 6));
    }
}
