package java;

import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. 1 = ");
        int a= sc.nextInt();
        System.out.println("enter no. 2 = ");
        int b= sc.nextInt();
        int sum= a+b;
        System.out.println(sum);
    }
}
