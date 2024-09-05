package java;

import java.util.Arrays;

public class method_overloading {
    public static void main(String[] args) {
       fun(1,2,3,4,5,6);
       fun("deep","aadi");
       int ans=value(34,43);
        System.out.println(ans);
       char ans1=value('a','b');
        System.out.println(ans1);
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(String...v){
        System.out.println(Arrays.toString(v));
    }
    static int value(int a , int b){
        return a+b;
    }
    static char value(char a, char b){
        return a;
    }
}
