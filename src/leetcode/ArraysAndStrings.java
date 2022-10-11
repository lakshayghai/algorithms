package leetcode;

public class ArraysAndStrings {

    public static void main(String[] args) {

//        System.out.println(oneAway("pale", "ple"));
//        System.out.println(oneAway("bales", "pale"));
//        System.out.println(oneAway("pale", "bale"));
//        System.out.println(oneAway("pale", "bake"));
        System.out.println(compression("abcd"));


    }

    public static String compression(String str) {
        StringBuilder updateWithCounts = new StringBuilder(str.length()*2);
        int count = 0;
        char current = str.charAt(0);
        for (char c: str.toCharArray()) {
            if(current == c) {
                count++;
            } else {
                updateWithCounts.append(current).append(count);
                current = c;
                count = 1;
            }
        }
        updateWithCounts.append(current).append(count);
        return updateWithCounts.toString().length() > str.length() ? str : updateWithCounts.toString();
    }

    public static boolean oneAway(String str1, String str2) {
        if(Math.abs(str1.length() - str2.length()) > 1) {
            return false;
        }
        if(str1.length() == str2.length()) {
            return sameLength(str1, str2);
        } else {
            return differentLength(str1,str2);
        }
    }

    private static boolean sameLength(String s1, String s2) {
        int edit = 0;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                edit++;
            }
            if(edit > 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean differentLength(String s1, String s2) {
        int edit = 0;
        int indexLong = 0;
        int indexShort = 0;

        String longerString = s1.length() > s2.length() ? s1 : s2;
        String shorterString = s1.length() > s2.length() ? s2 : s1;

        while (indexLong < longerString.length() && indexShort < shorterString.length()) {
            if(longerString.charAt(indexLong) == shorterString.charAt(indexShort)) {
                indexLong++;
                indexShort++;
            } else {
                indexLong++;
                edit++;
            }
            if(edit > 1) {
                return false;
            }
        }
        return true;
    }
}
