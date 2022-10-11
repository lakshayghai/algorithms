package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KWeakest {

    public static void main(String[] args) {
       int[][] mat =  new int[][] {{1,1,1,1,1},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,0}, {1,1,1,1,1}};
       int[][] mat1 = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
       int[][] mat2 = {{1,0},{0,0},{1,0}};
        System.out.println(kWeakestRows(mat, 3));

    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] count = new int[mat.length];
        int[] res = new int[k];
        for (int i = 0 ; i< mat.length; i++) {
            count[i] = (mat[i].length+1)*1000+ + i;
            for (int j=0 ; j<mat[i].length; j++) {
                if(mat[i][j] == 0){
                    count[i] = (j+1)*1000 + i;
                    break;
                }
            }
        }
        Arrays.sort(count);
        for (int i =0 ; i < k ; i++) {
            res[i] = count[i]%1000;
        }
        return res;
    }
}
