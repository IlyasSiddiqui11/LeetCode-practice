public class KthElementOfTwoSortedArrays {
    public static int kthElement(int[] a, int[] b, int k) {
        if (a.length > b.length) {
            return kthElement(b, a, k);
        }
        int n = a.length;
        int m = b.length;

        int low = Math.max(0, k - m);
        int high = Math.min(k, n);
        int leftSize = k;

        while (low <= high) {
            int partitionA = (low + high) / 2;
            int partitionB = leftSize - partitionA;

            int leftA = partitionA > 0
                    ? a[partitionA - 1]
                    : Integer.MIN_VALUE;

            int rightA = partitionA < n
                    ? a[partitionA]
                    : Integer.MAX_VALUE;

            int leftB = partitionB > 0
                    ? b[partitionB - 1]
                    : Integer.MIN_VALUE;

            int rightB = partitionB < m
                    ? b[partitionB]
                    : Integer.MAX_VALUE;

            if (leftA <= rightB && leftB <= rightA) {
                return Math.max(leftA, leftB);
            } else if (leftA > rightB) {
                high = partitionA - 1;
            } else {
                low = partitionA + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 7, 10, 11 };
        int[] nums2 = { 1, 2, 4, 5 };

        System.out.println(kthElement(nums1, nums2, 2));
    }
}
