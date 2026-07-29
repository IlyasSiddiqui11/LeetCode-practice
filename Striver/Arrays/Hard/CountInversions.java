public class CountInversions {
    // Dont use global variable to make code more better 
    // public static int count = 0;

    public static int mergeSort(int[] nums, int left, int right) {
        int count = 0;
        if (left >= right) {
            return count;
        }
        int mid = (right + left) / 2;
        count += mergeSort(nums, left, mid);
        count += mergeSort(nums, mid + 1, right);
        count += merge(nums, left, mid, right);
        return count;
    }

    public static int merge(int[] nums, int l, int m, int h) {
        int[] temp = new int[h - l + 1];
        int left = l;
        int right = m + 1;
        int index = 0;

        int count = 0;
        while (left <= m && right <= h) {
            if (nums[left] <= nums[right]) {
                temp[index++] = nums[left++];
            } else {
                temp[index++] = nums[right++];
                count += (m - left + 1);
            }
        }

        while (left <= m) {
            temp[index++] = nums[left++];
        }

        while (right <= h) {
            temp[index++] = nums[right++];
        }

        for (int i = 0; i < temp.length; i++) {
            nums[l + i] = temp[i];
        }
        return count;
    }
    public static int countInversion(int[] arr){
        int count = mergeSort(arr, 0, arr.length - 1);
        return count;
    }
    
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
        System.out.println(countInversion(arr));
    }
}
