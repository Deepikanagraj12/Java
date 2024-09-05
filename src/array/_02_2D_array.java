package array;

import java.util.Arrays;
import java.util.Scanner;
public class _02_2D_array {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
 /*     int[][] arrayy = new int[2][2];
            arrayy[0][0]=10;
            arrayy[0][1]=11;
            arrayy[1][0]=12;
            arrayy[1][1]=13;

  */

/*       int[][] arr = {
                {1, 2, 3}, // 0th index
                {4, 5}, // 1st index
                {6, 7, 8, 9} // 2nd index -> arr[2] = {6, 7, 8, 9}
       };

 */

            int[][] arr = new int[3][3];
            System.out.println(arr.length); // no of rows
            // input

            for (int row = 0; row < arr.length; row++) {
                // for each col in every row
                for (int col = 0; col < arr[row].length; col++) {
                    arr[row][col] = in.nextInt();
                }
            }

            // output
//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

            // output
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

            for(int[] a : arr) {
                System.out.println(Arrays.toString(a));
            }
        }
    }

