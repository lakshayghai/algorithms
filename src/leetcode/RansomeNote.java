package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RansomeNote {

    public static void main(String[] args) {
        System.out.println(RansomeNote.canConstruct("a", "b"));
        System.out.println(RansomeNote.canConstruct("aa", "ab"));
        System.out.println(RansomeNote.canConstruct("aaccaba", "aabcaacb"));

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> count = new HashMap<>();

        for (int i=0 ; i<magazine.length() ; i++) {
            String.valueOf(i);
            if(count.containsKey(magazine.charAt(i))) {
                int numberOfCharacters = count.get(magazine.charAt(i));
                numberOfCharacters++;
                count.put(magazine.charAt(i), numberOfCharacters);
            } else {
                count.put(magazine.charAt(i), 1);
            }
        }
        for (int i=0 ; i<ransomNote.length(); i++) {
            if (!count.containsKey(ransomNote.charAt(i))){
                return false;
            } else {
                if (count.get(ransomNote.charAt(i)) == 0) {
                    return false;
                } else {
                    int numberOfCharacters = count.get(ransomNote.charAt(i));
                    numberOfCharacters--;
                    count.put(ransomNote.charAt(i), numberOfCharacters);
                }
            }
        }
        return true;
    }
}
