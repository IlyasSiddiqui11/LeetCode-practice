package Striver.Recursion;

import java.util.List;
import java.util.ArrayList;

public class PowerSet {
    public List<List<String>> powerSet(String str) {
        List<List<String>> result = new ArrayList<>();
        generateSubsets(str, 0, new ArrayList<>(), result);
        return result;
    }

    private void generateSubsets(String str, int index, List<String> current,
            List<List<String>> result) {
        if (index == str.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        generateSubsets(str, index + 1, current, result);

        current.add(String.valueOf(str.charAt(index)));
        generateSubsets(str, index + 1, current, result);
        current.remove(current.size() - 1);
    }
}
