package Striver.Strings.Easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegertoRoman {
    public String intToRom(int num) {
        Map<Integer, String> romanMap = new LinkedHashMap<>();

        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");
        String total = "";
        for (Map.Entry<Integer, String> entry : romanMap.entrySet()) {
            while (num >= entry.getKey()) {
                total += entry.getValue();
                num -= entry.getKey();
            }
        }
        return total;
    }
}
