package Striver.Recursion;

import java.util.List;
import java.util.ArrayList;

public class PowerSet {
    public List<List<String>> powerSet(String str) {
        List<List<String>> result = new ArrayList<>();
        generateSubsetsStrings(str, 0, new ArrayList<>(), result);
        return result;
    }

    private void generateSubsetsStrings(String str, int index, List<String> current,
            List<List<String>> result) {
        if (index == str.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        generateSubsetsStrings(str, index + 1, current, result);

        current.add(String.valueOf(str.charAt(index)));
        generateSubsetsStrings(str, index + 1, current, result);
        current.remove(current.size() - 1);
    }


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void generateSubsets(int[] nums, int index, List<Integer> current,
            List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        generateSubsets(nums, index + 1, current, result);

        current.add(nums[index]);
        generateSubsets(nums, index + 1, current, result);
        current.remove(current.size() - 1);
    }
}
