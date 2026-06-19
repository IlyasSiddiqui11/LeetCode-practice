public class QuickSort {
    public static void quickSort(int[] nums, int low, int high) {
        if (high > low) {
            int partitionIndex = partition(nums, low, high);
            quickSort(nums, low, partitionIndex - 1);
            quickSort(nums, partitionIndex + 1, high);
        }
    }

    
    public static int partition(int[] nums, int low, int high){

        int pivot = nums[low];
        int i = low;
        int j = high;
        while (i < j) {
                while (nums[i] <= pivot && i <= high-1) {
                    i++;
                }
                while (nums[j] > pivot && j >= low+1) {
                    j--;
                }
                if (i<j) {
                    swap(nums,i,j);
                }
            }
            swap(nums,low,j);
            return j;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 2, 5, 7, 9, 1, 3 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(java.util.Arrays.toString(arr));
    }
}

