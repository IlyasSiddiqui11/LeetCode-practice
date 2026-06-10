package LeetCode;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String tr = s.trim();
        char[] arr = tr.toCharArray();
        int len = 0;
        int i = arr.length - 1;
        while (i >= 0 && tr.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && tr.charAt(i) != ' ') {
            len++;
            i--;
        }
        return len;
    }
}
