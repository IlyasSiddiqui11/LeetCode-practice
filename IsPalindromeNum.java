package LeetCode;

public class IsPalindromeNum {
    public static boolean isPallindrome(int x) {
        if (x < 0)
            return false;
        int p = x;
        int reversed = 0;
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return p == reversed;
    }
}
