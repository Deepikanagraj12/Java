package Sorting;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
       int [] array={8,7,6,5,4,};
       bubble(array);
        System.out.println(Arrays.toString(array));
    }
    static void bubble(int[] array){
        boolean swapped;
        for (int i=0;i<array.length;i++) {
            swapped=false;
           for(int j=1;j< array.length-i;j++){
               if(array[j] < array[j-1]){
                   int temp=array[j];
                   array[j]=array[j-1];
                   array[j-1]=temp;
                   swapped=true;
               }
           }
            if(!swapped) {
                break;
            }
         }
      }
    }
