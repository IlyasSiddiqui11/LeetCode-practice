public class isPrime {
    public static boolean isPrime(int x){
        int count = 0;
        for(int i = 1;i<=Math.sqrt(x);i++){
            if (x % i == 0) {
                count++;
            }
            if ((x/i)!=i) {
                count++;
            }
        }
        return count == 2;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(16));
    }
}
