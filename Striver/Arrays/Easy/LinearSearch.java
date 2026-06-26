public class LinearSearch {
    public static int linearSearch(int[] nums,int target){
        for(int i = 0;i<nums.length;i++){
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0,2,3,5,2,5,1,3,88};
        System.out.println(linearSearch(arr, 88));
    }
}
