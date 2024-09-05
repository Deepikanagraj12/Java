import java.util.Arrays;

public class _12_Searching_in_2DArray {
    public static void main(String[] args) {
        int[][] array=
                    {   {2,3,4,5},
                        {1,6,7},
                        {8,9}       };
        int target=18;
        int[] ans= search(array,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(minimum(array));
    }
    static int[] search(int[][] array,int target){
        for(int row=0;row< array.length;row++){
            for(int col=0;col<array[row].length;col++){
                if (array[row][col]==target) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int minimum(int[][] array){
        int min=Integer.MAX_VALUE;
        for(int row=0;row< array.length;row++){
            for(int col=0;col<array[row].length;col++){
                if (array[row][col]<min) {
                   min=array[row][col];
                }
            }
        }
        return min;
    }
}
