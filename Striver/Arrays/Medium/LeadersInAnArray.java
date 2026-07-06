package Striver.Arrays.Medium;

import java.util.ArrayList;

public class LeadersInAnArray {
    public static ArrayList<Integer> leadersInArray(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int max = 0;
        for(int i = arr.length-1;i>=0;i--){
            if (arr[i] > max) {
                max = arr[i];
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        System.out.println(leadersInArray(arr));
    }
}
