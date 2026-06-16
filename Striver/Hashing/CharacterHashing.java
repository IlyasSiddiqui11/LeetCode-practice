package Striver.Hashing;
import java.util.HashMap;
import java.util.Map;

public class CharacterHashing {
    // For lowercase characters only (a-z)
    public static int charOccurrenceLowercase(String s, char c) {
        int hash[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        return hash[c - 'a'];
    }

    // For all 256 ASCII characters
    // public static int charOccurrenceAll(String s, char c) {
    //     int hashAll[] = new int[256];

    //     for (int i = 0; i < s.length(); i++) {
    //         hashAll[s.charAt(i)]++;
    //     }

    //     return hashAll[c];
    // }

    // Using HashMap for all characters
    public static int charOccurrenceAll(String s, char c){
        Map<Character, Integer> map = new HashMap<>();
        // Put and Get has O(1) TC at Average and Best case
        // For Worst case it will be O(N)
        for(int i = 0; i < s.length();i++){
            char current = s.charAt(i);
            map.put(current, map.getOrDefault(current,0)+1);
        }
        return map.getOrDefault(c,0);
    }

    public static void main(String[] args) {
        String s = "aababb";
    //     System.out.println("Lowercase function: " + charOccurrenceLowercase(s, 'a'));
    //     System.out.println("All characters function: " + charOccurrenceAll(s, 'a'));

        System.out.println(charOccurrenceAll(s, 'a'));
    }
}
