package Striver.Recursion;

public class SumofNNumbers {
    public static int NnumberSum(int n){
        if (n==0) {
            return 0;
        }
        return n + NnumberSum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(NnumberSum(3));
    }
}
