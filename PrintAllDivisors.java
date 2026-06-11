
public class PrintAllDivisors {
    public static void divisors(int x){
        for(int i = 1;i<=x;i++){
            if (x % i == 0) {
                System.out.println(i);
            }
        }
    }

    // Better Time Complexity
    public static void divisorsII(int x){
        for(int i = 1;i<=Math.sqrt(x);i++){
            if (x % i == 0) {
                System.out.println(i);
            }
            if ((x/i)!=i) {
                System.out.println(x/i);
            }
        }
    }

    public static void main(String[] args) {
        divisorsII(36);
    }
}
