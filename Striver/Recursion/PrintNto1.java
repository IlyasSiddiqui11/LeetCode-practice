package Striver.Recursion;
public class PrintNto1 {
    public static void RevNumbers(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        RevNumbers(n - 1);
    }

    public static void main(String[] args) {
        RevNumbers(4);
    }
}
