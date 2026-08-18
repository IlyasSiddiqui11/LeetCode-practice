public class FindSquareRootOfANumber {
    public static int squareRoot(int x){
        if (x < 2) return x;
        int low = 1, high = x / 2;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid <= x) {
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(squareRoot(36));
    }
}
