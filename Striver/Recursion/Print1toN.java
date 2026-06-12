package Striver.Recursion;

public class Print1toN {
    public static void printNumbers(int n) {
        if (n <= 0)
            return;
        printNumbers(n - 1);
        System.out.println("\n" + n);
    }

    public static void main(String[] args) {
        printNumbers(2);
    }
}
