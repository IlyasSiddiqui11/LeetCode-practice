// package Striver.Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IntersectionOfTwoSortedArrays {
    public static List<Integer> intersectionOfArray(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        List<Integer> intersection = new ArrayList<>();
        List<Integer> visited = new ArrayList<>();
        for (int k = 0; k < arr2.length; k++) {
            visited.add(0);
        }
        for (i = 0; i < arr1.length; i++) {
            for (j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && visited.get(j) == 0) {
                    intersection.add(arr1[i]);
                    visited.set(j, 1);
                    break;
                }
                if (arr1[i] < arr2[j]) break;
            }
        }
        return intersection;
    }

    public static void main(String[] args) {
        int[] arr1 = {0,1,1,2,3,4};
        int[] arr2 = {1,2,3,4,5};
        System.out.println(intersectionOfArray(arr1, arr2));
    }
}