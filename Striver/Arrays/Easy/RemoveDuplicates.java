public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums){
        int p = 0;
        for(int i = 1;i<nums.length;i++){
            if (nums[i] != nums[p]) {
                p++;
                nums[p] = nums [i];
            }
        }
        return p+1;
    }

    public static void main(String[] args) {
        int[] arr= {1,1,1,2,4,4,4,5,5};
        System.out.println(removeDuplicates(arr));
    }
}
