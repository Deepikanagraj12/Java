package java;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        //while loop for fibbo
        System.out.println("enter no");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int count=2;

        while(count<=n){
            int temp=b;
            b= b+a;
            a=temp;
            count++;

        }
        System.out.println(b);
    }
}
