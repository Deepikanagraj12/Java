package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array={9,7,6,43,2};
        selection(array);
        System.out.println(Arrays.toString(array));
    }

    static void selection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int last=array.length-i-1;
            int maxindex=getmax(array,0, last);
            swap(array, maxindex,last);
        }
    }

    static void swap(int[] array,int first,int second){
        int temp= array[first];
        array[first]=array[second];
        array[second]=temp;
    }

    static int getmax(int[] array, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (array[max] < array[i]) {
                max = i;
            }
        }
        return max;
    }
}