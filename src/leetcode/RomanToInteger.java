package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    static Map<Character, Integer> conversion = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Result = " + RomanToInteger.romanToInteger("MCMXCIV"));
        System.out.println("Result = " + RomanToInteger.romanToInteger("III"));
        System.out.println("Result = " + RomanToInteger.romanToInteger("IV"));
        System.out.println("Result = " + RomanToInteger.romanToInteger("MMCMXLIV"));

    }
    static {
        conversion.put('I', 1);
        conversion.put('V', 5);
        conversion.put('X', 10);
        conversion.put('L', 50);
        conversion.put('C', 100);
        conversion.put('D', 500);
        conversion.put('M', 1000);
    }

    public static int romanToInteger(String s) {
        int result = 0;
        for (int i=0; i<s.length(); i++) {
            int j=i+1;
            int current = conversion.get(s.charAt(i));
            int next = 0;
            if (j < s.length()) {
                next = conversion.get(s.charAt(j));
            }
            if (current >= next) {
                result = result + current;
            } else {
                result = result + (next - current);
                i = j;
            }

        }
        return result;
    }
}
