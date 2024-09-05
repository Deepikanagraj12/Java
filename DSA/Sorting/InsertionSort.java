package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] array={6,4,2,8,4};
        insertion(array);
        System.out.println(Arrays.toString(array));
    }
    static void insertion(int [] array){
        for(int i=0;i< array.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(array[j]<array[j-1]){
                    swap(array,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] array, int first,int second){
        int temp=array[first];
        array[first]=array[second];
        array[second]=temp;
    }
}
