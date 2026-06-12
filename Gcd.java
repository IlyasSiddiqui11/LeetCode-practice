public class Gcd {
    public static int gcd(int n1,int n2){
        int gcd = 1;
        for(int i = 1;i<=Math.min(n2, n1);i++){
            gcd = i;
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(gcd(11, 22));
    }
}
