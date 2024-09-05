package array;

import java.util.Arrays;

public class _01_arrays {
    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0]=11;
        nums[1]=12;
        nums[2]=13;
        nums[3]=14;
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]);

                //modifying array

        int[] arr= {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        modify(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void modify(int[] arr){
        arr[0] =9;
    }
}
