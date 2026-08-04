public class BinarySearch {
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) {
                high = mid - 1;
            } 
            else{
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int searchRecursive(int[] nums, int target, int low, int high){
        if (low >= high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (nums[mid] == target) return mid;
        else if (nums[mid] > target) {
            searchRecursive(nums, target, low, mid - 1);
        } 
        else{
            searchRecursive(nums, target, mid + 1, high);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,3,5,6};
        System.out.println(searchRecursive(arr, 3,0,arr.length-1));
        System.out.println(search(arr, 7));
    }
}
