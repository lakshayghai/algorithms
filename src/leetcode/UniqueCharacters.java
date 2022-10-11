package leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {

    public static void main(String[] args) {
        //System.out.println(uniqueCharacters("abc"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static boolean uniqueCharacters(String s) {
        int checker = 0;
        for (int i=0; i< s.length(); i++) {
            int checkerVector = 1 << (s.charAt(i) - 'a');
            if ((checker & checkerVector) > 0) {
                return false;
            }
            checker = checker | checkerVector;
        }
        return true;
    }

    public static int lengthOfLongestSubstring1(String s) {
        long checker = 0;
        int answer=0;
        int temp = 0;
        for(int i = 0; i < s.length(); i++) {
            long checkBit = 1 << (s.charAt(i));
            if((checker & checkBit) > 0) {
                temp = 1;
                checker = 0;
            } else {
                temp++;
            }
            checker = checker | checkBit;
            if(temp > answer) {
                answer = temp;
            }
        }
        return answer;
    }

    public static int lengthOfLongestSubstring(String s) {
        int answer=0;
        int left = 0;
        int right = 0;
        Set<Character> unique = new HashSet<>();
        while (right < s.length()) {
            if (!unique.contains(s.charAt(right))) {
                unique.add(s.charAt(right));
                answer = Math.max(answer, unique.size());
                right++;
            } else {
                unique.remove(s.charAt(left));
                left++;
            }
        }
        return answer;
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }


}
