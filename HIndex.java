package LeetCode;

public class HIndex {
    public static int hIndex(int[] citations) {
        int arr[] = new int[citations.length + 1], count = 0;
        for (int i : citations) {
            if (i > citations.length) {
                arr[citations.length]++;
            } else {
                arr[i]++;
            }
        }
        for (int i = citations.length; i >= 0; i--) {
            count = count + arr[i];
            if (i <= count) {
                return i;
            }
        }
        return 0;
    }
}
