package stringmatching;

import java.util.ArrayList;
import java.util.List;

public class BruteForce {

    public static void main(String[] args) {
        List<Integer> foundIndex = BruteForce.bruteForce("aab", "acaabcaab");
        if (foundIndex.isEmpty()) {
            System.out.println("No String Matched");
        } else {
            for (Integer index : foundIndex) {
                System.out.println("Matched String found at : " + index);
            }
        }
    }

    public static List<Integer> bruteForce(String pattern, String sentence) {
        List<Integer> foundIndex = new ArrayList();
        for (int i = 0 ; i < sentence.length() - pattern.length() + 1 ; i++) {
            for (int j = 0 ; j < pattern.length()  ; j++) {
                if (pattern.charAt(j) != sentence.charAt(i + j))
                    break;
                if (j == pattern.length() - 1) {
                    foundIndex.add(i);
                }
            }
        }
        return foundIndex;
    }
}
