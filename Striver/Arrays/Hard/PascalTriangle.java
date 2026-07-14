// package Striver.Arrays.Hard;

public class PascalTriangle {

    public static int factorial(int n){
        if (n==0) {
            return 1;
        }
        return n * factorial(n-1);
    }
    public static int generate1(int row, int column){
        //Brute
        int n = row - 1;
        int r = column - 1;
        // return factorial(n)/(factorial(r)*factorial(n - r));

        //Better 
        int res = 1;
        for(int i = 0;i < r;i++){
            res = res * (n - i);
            res = res / (i + 1);
        }

        return res;
    }

    public static void generate2(int row){
        // Brute
        // for(int c = 1;c<=row;c++){
        //     System.out.println(generate1(row, c));
        // }
    
        int ans = 1;
        System.out.println(ans);
        for(int i = 1; i<row;i++){
            ans = (ans * (row -i)) / i;
            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        generate2(5);
    }
}