package leetcode;

public class PermutationString {

    public static void main(String[] args) {
        String str= "ABCD";
        permute(str, 0, str.length() - 1);
    }

    public static void permute(String str, int l, int r) {
        if(l == r) {
            System.out.println(str);
        }
        for (int i = l ; i<=r; i++) {
            str = swap(str, l, i);
            permute(str, l+1 , r);
            str = swap(str, l, i);
        }
    }

    private static String swap(String str, int l, int i){
        char[] strArray = str.toCharArray();
        char temp = strArray[l];
        strArray[l] = strArray[i];
        strArray[i] = temp;
        return new String(strArray);
    }
}
