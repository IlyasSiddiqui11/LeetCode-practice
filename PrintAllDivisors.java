import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PrintAllDivisors {
    public static List<Integer> divisors(int x){
        List<Integer> list = new ArrayList<>();
        for(int i = 1;i<=x;i++){
            if (x % i == 0) {
                list.add(i);
            }
        }
        list.sort(null);
        return list;
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
        System.out.println(divisors(36));
    }
}
