package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _03_nofixcolumn_ {
    public static void main(String[] args) {
        int[][] array= {
                {1,2,3,4},
                {1,46,7,8,9},
                {4,5,6,8}
             };
  /*              for(int row=0; row<array.length;row++){
                    for(int col =0; col<array[row].length;col++){
                        System.out.print(array[row][col]+ " ");
                    }
                    System.out.println();
                }
  */
                        //for each loop
        for(int[] row:array){
            System.out.println(Arrays.toString(row));
        }
    }
}
