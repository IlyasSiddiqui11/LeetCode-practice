public class ReversePairs {
    public static int mergeSort(int[] nums, int left, int right) {
        int count = 0;
        if (left >= right) {
            return count;
        }
        int mid = (right + left) / 2;
        count += mergeSort(nums, left, mid);
        count += mergeSort(nums, mid + 1, right);
        count += countPairs(nums, left, mid, right);
        merge(nums, left, mid, right);
        return count;
    }

    public static int[] merge(int[] nums, int l, int m, int h) {
        int[] temp = new int[h - l + 1];
        int left = l;
        int right = m + 1;
        int index = 0;

        while (left <= m && right <= h) {
            if (nums[left] <= nums[right]) {
                temp[index++] = nums[left++];
            } else {
                temp[index++] = nums[right++];
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
        return nums;
    }
    public static int countPairs(int[] nums, int low, int mid, int high){
        int right = mid + 1;
        int count = 0;
        for(int i = low; i <= mid; i++){
            while (right <= high && (long) nums[i] > 2 * (long) nums[right]) {
                right++;
            }
            count += (right - (mid + 1));
        } 
        return count;
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
}
