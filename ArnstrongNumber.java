

public class ArnstrongNumber {
    public static boolean isArmstrong(int x){
        int p = 0,lastDigit;
        int og = x;
        while (x > 0) {
            lastDigit= x % 10;
            p += (lastDigit*lastDigit*lastDigit);
            x /= 10;
        }
        return p == og;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}

