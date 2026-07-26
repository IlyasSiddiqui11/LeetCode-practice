public class MergeSortedArray {
    private static void swapIfGreater(int[] arr1, int[] arr2, int i, int j) {
        if (arr1[i] > arr2[j]) {
            int temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
        }
    }
    public static void mergeGap(int[] nums1, int m, int[] nums2, int n) {
        int len = (m + n);
        int gap = (len / 2) + (len % 2);
        while (gap > 0) {
            int left = 0;
            int right = left + gap;
            while (right < len) {
                //nums1 and nums2
                if (left < m && right >= m) {
                    swapIfGreater(nums1, nums2,left, right - m);
                }
                // nums2 and nums2
                else if (left >= m ) {
                    swapIfGreater(nums2, nums2,left - m, right - m);
                }
                //nums1 and nums1
                else{
                    swapIfGreater(nums1, nums1,left, right);
                }
                left++;
                right++;
            }
            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, idx = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[idx] = nums1[i];
                i--;
                idx--;
            } else {
                nums1[idx] = nums2[j];
                idx--;
                j--;
            }
        }
        while (j >= 0) {
            nums1[idx] = nums2[j];
            idx--;
            j--;
        }
    }
    public static void main(String[] args) {
        
    }
}
