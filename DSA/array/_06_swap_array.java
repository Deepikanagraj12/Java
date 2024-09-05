package array;

import java.util.Arrays;

public class _06_swap_array {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        swap(array,0,4);
        System.out.println(Arrays.toString(array));
    }
    static void swap(int[] array ,int index1,int index2){
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;

    }
}
