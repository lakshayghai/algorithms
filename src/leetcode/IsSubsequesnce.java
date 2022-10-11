package leetcode;

import java.util.List;
import java.util.Map;

public class IsSubsequesnce {

    public static void main(String[] args) {
        System.out.println(isSubsequence("ce", "abcde"));
    }

    public static boolean isSubsequence(String s, String t) {
        int j = 0;

        for (char c: t.toCharArray()) {
            if(c == s.charAt(j)) {
                j++;
            }
            if(j == s.length()) return true;
        }
        return false;
    }
}
