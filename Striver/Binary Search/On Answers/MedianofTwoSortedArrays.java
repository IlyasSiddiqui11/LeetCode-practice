public class MedianofTwoSortedArrays {

    public static double findMedianSortedArraysBrute(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                nums3[k] = nums1[i];
                i++;
            } else {
                nums3[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < nums1.length) {
            nums3[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            nums3[k] = nums2[j];
            j++;
            k++;
        }

        if (nums3.length % 2 == 0) {
            int ele1 = nums3[nums3.length / 2];
            int ele2 = nums3[(nums3.length / 2) - 1];
            return (ele1 + ele2) / 2.0;
        }
        return nums3[nums3.length / 2];
    }

    public static double findMedianSortedArraysBetter(int[] nums1, int[] nums2) {
        int cnt = 0, i = 0, j = 0;
        int idx1 = (nums1.length + nums2.length) / 2;
        int idx2 = ((nums1.length + nums2.length) / 2) - 1;
        int ele1 = -1, ele2 = -1;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                if (cnt == idx1) ele1 = nums1[i];
                if (cnt == idx2) ele2 = nums2[i];
                cnt++;
                i++;
            }
            else {
                if (cnt == idx1) ele1 = nums1[j];
                if (cnt == idx2) ele2 = nums2[j];
                cnt++;
                j++;
            }
        }

        while (i < nums1.length) {
            if (cnt == idx1) ele1 = nums1[i];
            if (cnt == idx2) ele2 = nums2[i];
            cnt++;
            i++;
        }

        while (j < nums1.length) {
            if (cnt == idx1) ele1 = nums1[j];
            if (cnt == idx2) ele2 = nums2[j];
            cnt++;
            j++;
        }

        int n = nums1.length + nums2.length;
        if (n % 2 == 1) {
            return ele1;
        }
        return (ele1 + ele2) / 2.0;
    }

    // Binary Search
    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int n = nums1.length;
        int m = nums2.length;

        int low = 0;
        int high = n;
        int leftSize = (n + m + 1) / 2;

        while(low <= high){
            int partitionA = (low + high) / 2;
            int partitionB = leftSize - partitionA;

            int leftA = (partitionA == 0)
                    ? Integer.MIN_VALUE
                    : nums1[partitionA - 1];

            int rightA = (partitionA == n)
                    ? Integer.MAX_VALUE
                    : nums1[partitionA];

            int leftB = (partitionB == 0)
                    ? Integer.MIN_VALUE
                    : nums2[partitionB - 1];

            int rightB = (partitionB == m)
                    ? Integer.MAX_VALUE
                    : nums2[partitionB];

            if (leftA <= rightB && leftB <= rightA) {
                if ((n + m) % 2 == 1) {
                    return Math.max(leftA, leftB);
                }

                return (Math.max(leftA, leftB)
                    + Math.min(rightA, rightB)) / 2.0;
            }
            else if (leftA > rightB) {
                high = partitionA - 1;
            }
            else {
                low = partitionA + 1;
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,4,7,10,12};
        int[] arr2 = {2,3,6,15};

        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}
