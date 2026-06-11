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
        if (count==2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(16));
    }
}
