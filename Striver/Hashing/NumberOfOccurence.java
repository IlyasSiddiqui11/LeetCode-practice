package Striver.Hashing;

import java.util.HashMap;

public class NumberOfOccurence {
    public static int numberOfOccurence(int[] arr,int q){
        // int hash[] = new int[arr.length+1];
        // for(int i = 0;i < arr.length;i++){
        //     hash[arr[i]] += 1;
        // }
        // return hash[q];

        HashMap <Integer ,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            int key = arr[i];
            map.put(key, map.getOrDefault(key,0)+1);
        }
        return map.getOrDefault(q,0);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,1,3,2};
        System.out.println(numberOfOccurence(arr, 2));
    }
}
