package leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    public static void main(String[] args) {

        System.out.println(isIsomorphic("egg", "adb"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));

    }

    public static boolean isIsomorphic(String s, String t) {

        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();
        for (int i = 0 ; i < s.length() ; i++) {
            Character charS = s.charAt(i);
            Character charT = t.charAt(i);
            if (!sToT.containsKey(charS) && !tToS.containsKey(charT)) {
                sToT.put(charS, charT);
                tToS.put(charT, charS);
            } else {
                if(!(sToT.get(charS) == charT && tToS.get(charT) == charS)) {
                    return false;
                }
            }
        }
        return true;
    }
}
