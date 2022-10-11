package leetcode;

public class TwoStringPermutation {

    public static void main(String[] args) {
        System.out.println(checkPermutation("He llo","lloHe "));
    }

    public static boolean checkPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] letters = new int[128];
        for (char c: str1.toCharArray()) {
            letters[c]++;
        }
        for (char c: str2.toCharArray()) {
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }
        return true;
    }
}
