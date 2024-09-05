package java;

import java.util.Scanner;

public class return_type {
    public static void main(String[] args) {
         String statement= greet();
        System.out.println("hello! "+ statement);
    }
    static String greet(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name ");
        String name=sc.next();
        return name;
    }
}
