package Striver.Recursion;

public class Fibonacci {
    public static int fib(int n){
        if (n <= 1) {
            return n;
        }
        int lastDigit = fib(n-1);
        int secondLastDigit = fib(n-2);
        // Time Complexity is O(2^n)
        return lastDigit + secondLastDigit;
    }
}
