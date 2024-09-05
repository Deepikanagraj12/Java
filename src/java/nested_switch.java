package java;

import java.util.Scanner;

public class nested_switch {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String name = sc.next();
        int empId = sc.nextInt();

        switch (name) {
            case "a" -> {
                System.out.println("deepika");
                switch (empId){
                    case 1-> System.out.println("1234567");
                    case 2-> System.out.println("4567123");
                    default -> System.out.println("enter valid id ");
                }
            }
            case "b" -> {
                System.out.println("deepansh") ;
                switch (empId){
                    case 1-> System.out.println("1234567");
                    case 2-> System.out.println("4567123");
                    default -> System.out.println("enter valid id ");
                }
            }
        }
    }
}
