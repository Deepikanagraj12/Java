package array;

import java.util.ArrayList;
import java.util.Scanner;

public class _05_multiD_arraylist {
    public static void main(String[] args) {
 /*       ArrayList<ArrayList<String>> restaurant= new ArrayList<>();

        ArrayList<String> drink=new ArrayList<>();
        drink.add("coke");
        drink.add("tea");
        drink.add("Shake");

        ArrayList<String> food=new ArrayList<>();
        food.add("indian");
        food.add("chinese");
        food.add("italian");
                                   //adding both list to multiList
        restaurant.add(drink);
        restaurant.add(food);

        System.out.println(restaurant);

  */
                                          //User input
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
                                     //initializing
        for(int i=0; i< 3; i++) {
            list.add(new ArrayList<>());
         }
                                    //adding element
        for(int i=0; i<3; i++){
            for(int j=0; j< 3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
