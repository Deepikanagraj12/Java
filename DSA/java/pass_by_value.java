package java;

import java.util.Arrays;

public class pass_by_value {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] num){
        num[2]=9;
    }
}
