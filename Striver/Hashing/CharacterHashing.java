public class CharacterHashing {
    public static int charOccurence(String s, char c) {
        // For lowercase characters hashing 
        // int hash[] = new int[26];

        // For hashng all the characters 
        int hashAll[] = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            // For lowercase characters hashing
            // hash[s.charAt(i) - 'a']++;

            // For hashng all the characters
            hashAll[s.charAt(i)]++;
        }

        // For lowercase characters hashing
        // return hash[c];

        // For hashng all the characters
        return hashAll[c];
    }

    public static void main(String[] args) {
        String s = "aababb";
        System.out.println(charOccurence(s, '='));
    }
}
