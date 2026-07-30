public class BS1 {
    public static int lowerBound(int[] arr, int x){
        int ans = arr.length;
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x){
                high = mid - 1;
                ans = mid;
            }
            else if (arr[mid] <= x ) {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int upperBound(int[] arr, int x){
        int ans = arr.length;
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] > x){
                high = mid - 1;
                ans = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int floor(int[] arr, int x){
        int ans = -1;
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] <= x){
                low = mid + 1;
                ans = arr[mid];
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private static int ceil(int[] arr, int x){
        int ans = -1;
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x){
                high = mid - 1;
                ans = arr[mid];
            }
            else if (arr[mid] <= x ) {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void floorAndCeil(int[] nums, int x){
        System.out.println("Floor: " + floor(nums, x));
        System.out.println("Ceil: " + ceil(nums, x));
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        floorAndCeil(arr, 25);
    }
}
