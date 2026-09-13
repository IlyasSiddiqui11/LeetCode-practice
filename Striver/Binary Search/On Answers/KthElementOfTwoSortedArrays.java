public class KthElementOfTwoSortedArrays {
    public int kthElement(int[] a, int[] b, int k) {
        if (a.length > b.length) {
            return kthElement(b, a,k);
        }
        int n = a.length;
        int m = b.length;

        int low = Math.max(0, k - m);
        int high = Math.min(k, n);
        int leftSize = (n + m + 1) / 2;

        while(low <= high){
            int partitionA = (low + high) / 2;
            int partitionB = leftSize - partitionA;

            int leftA = (partitionA == 0)
                    ? Integer.MIN_VALUE
                    : a[partitionA - 1];

            int rightA = (partitionA == n)
                    ? Integer.MAX_VALUE
                    : a[partitionA];

            int leftB = (partitionB == 0)
                    ? Integer.MIN_VALUE
                    : b[partitionB - 1];

            int rightB = (partitionB == m)
                    ? Integer.MAX_VALUE
                    : b[partitionB];

            if (leftA <= rightB && leftB <= rightA) {
                if ((n + m) % 2 == 1) {
                    return Math.max(leftA, leftB);
                }
            }
            else if (leftA > rightB) {
                high = partitionA - 1;
            }
            else {
                low = partitionA + 1;
            }
        }
        return 0;
    }
}
