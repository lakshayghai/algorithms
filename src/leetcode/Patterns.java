package leetcode;

public class Patterns {

    public static void main(String[] args) {
        pattern1(5);
    }

    /*
            1
          2 1 2
        3 2 1 2 3
          2 1 2
            1

     */
    public static void pattern1(int n) {
        for (int i=1; i< 2*n; i++) {
            int numberOfSpaces = i > n ? n - (2*n - i) : n-i;
            for (int col = 1; col<= numberOfSpaces; col++) {
                System.out.print(" ");
            }
            int startNumberToPrint = i>n ? 2*n - i : i;
            for (int col = startNumberToPrint; col >=1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= startNumberToPrint; col++) {
                System.out.print(col);
            }
            System.out.println("");
        }
    }
}
