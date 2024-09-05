package array;

import java.util.Scanner;

public class _02_multiDarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] array =new int[3][3];

        for(int row=0;row< array.length;row++){
            for(int col =0;col< array[row].length;col++){
                array[row][col] = sc.nextInt();
            }
        }
        for(int row=0;row< array.length;row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }
}
