package java;

import java.util.Arrays;
public class variable_argument {
    public static void main(String[] args) {
        multiple("deep",2,5,8);
    }
    static void multiple(String a ,int...v){
        System.out.println(a+ " " +Arrays.toString(v));
    }
}
