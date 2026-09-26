package Striver.Strings.Easy;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> mp = new HashMap<>(Map.of(
            'I',1,
            'V',5,
            'X',10,
            'L',50,
            'C',100,
            'D',500,
            'M',1000
        ));

        int total = 0;
        for (int index = 0; index < s.length(); index++) {
            int value = mp.get(s.charAt(index));
            if (index + 1 < s.length() && value < mp.get(s.charAt(index + 1))) {
                total -= value;
            } else {
                total += value;
            }
        }
        return total;
    }
}
