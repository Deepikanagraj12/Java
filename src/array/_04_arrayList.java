package array;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_arrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       ArrayList<Integer> list = new ArrayList<>(5);
 /*       list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        System.out.println(list);
                      // update
        list.set(2,32);
        System.out.println(list);
                      //to check if element is present
        System.out.println(list.contains(11));
        System.out.println(list.contains(10));
                      //remove any element
        list.remove(0);
        System.out.println(list);

  */
                                        //taking user input
        for(int i=0;i<10;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<10;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
