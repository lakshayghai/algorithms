//package stringmatching;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class RabinKarp {
//
//    public static void rabinKarp(String pattern, String sentence) {
//        long patternHash = RabinKarp.hash(pattern, pattern.length(), 13);
//        long sentenceHash = RabinKarp.hash(sentence, pattern.length(), 13);
//        List<Integer> foundIndex = new ArrayList();
//        if(patternHash == sentenceHash && check(pattern, sentence, 0)) {
//            foundIndex.add(0);
//        }
//        for (int i = pattern.length() ; i < sentence.length() - pattern.length() + 1 ; i++)
//            if(patternHash == sentenceHash && check(pattern, sentence, i)) {
//                foundIndex.add(i);
//            }
//        sentenceHash = sentenceHash - (256 * h + key.charAt(j)) % q;
//
//    }
//
//    private static boolean check(String pattern, String sentence, int index) {
//        for (int j=0; j < pattern.length() ; j++) {
//            if (pattern.charAt(j) != sentence.charAt(j + index))
//                break;
//            if (j == pattern.length() - 1)
//                return true;
//        }
//        return false;
//    }
//
//    private static long hash(String key, int m, long q) {
//        long h = 0;
//        for (int j = 0; j < m; j++)
//            h = (256 * h + key.charAt(j)) % q;
//        return h;
//    }
//}
