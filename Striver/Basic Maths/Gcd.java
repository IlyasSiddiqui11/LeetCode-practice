public class Gcd {
    public static int gcd(int n1,int n2){
        // int gcd = 1;
        // for(int i = 1;i<=Math.min(n2, n1);i++){
        //     gcd = i;
        // }
        // return gcd;

        // Euclidean Algorithm
        while(n1>0 && n2>0){
            if(n1>n2) n1%=n2;
            else n2%=n1;
        }
        if(n1==0) return n2;
        return n1;
    }

    public static void main(String[] args) {
        System.out.println(gcd(11, 22));
    }
}
