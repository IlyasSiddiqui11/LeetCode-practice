package Striver.Strings.Easy;

public class CountNumberOfSubStrings {
    public long countSubstrings(String s) {
        long n = s.length(); 
        return (n*(n+1)) / 2;
    }
}
