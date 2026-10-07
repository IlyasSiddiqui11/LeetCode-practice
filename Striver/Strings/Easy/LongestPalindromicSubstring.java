package Striver.Strings.Easy;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int n = s.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            String st = "";
            for (int j = i; j < n; j++) {
                st += s.charAt(j);
                if (checkIfPalindrome(st) && st.length() > ans.length()) {
                        ans = st;
                }
            }
        }
        return ans;
    }

    private static boolean checkIfPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j && s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        }
        return i >= j;
    }
}
