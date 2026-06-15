package Striver.Recursion;

public class PaliindromeString {
    public static void main(String[] args) {
        String name = "madam";
        System.out.println(isPallindrome(name, 0, name.length()-1));
    }

    public static boolean isPallindrome(String m, int l, int r){
        m.toLowerCase();
        /*l >= r approach:
        l=0,r=4 → compare n,n ✓ → continue
        l=1,r=3 → compare i,i ✓ → continue  
        l=2,r=2 → l >= r → STOP, return true ✓

        l >= m.length()/2 approach:
        l=0 → 0 >= 2? No → compare
        l=1 → 1 >= 2? No → compare
        l=2 → 2 >= 2? Yes → STOP */ 

        // OPTIMAL
        // l >= m.length()/2 

        if (l >= m.length()/2) {
            return true;
        }
        if ( m.charAt(l)!=m.charAt(r) ) {
            return false;
        }

        return isPallindrome(m,l+1,r-1);
    }
}
