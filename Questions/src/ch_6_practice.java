import java.sql.SQLOutput;

public class ch_6_practice {
    public static void main(String[] args) {
                                                                   // que-1:
        float[] number = {2.5f, 3.4f, 4.3f, 5.1f, 6.1f};
        float sum = 0;
        for (float element : number)
            sum = sum + element;
        System.out.println("sum = " + sum / number.length);
                                                                  // que-2:
        int[] integer = {7, 9, 6, 3, 5};
        int num = 8;
        boolean isAnArray = false;
        for (int element : integer)
            if (element == num) {
                isAnArray = true;
                break;
            }
        if (isAnArray) {
            System.out.println("num is present in the array");
        } else {
            System.out.println("num is not present in the array");
        }

                                                                          // que3:
        float[] marks = {89f, 75f, 98f, 64f, 58f, 68f, 79f, 48f};
        float sum1 = 0;
        for (float element : marks)
            sum1 = sum1 + element;
        System.out.println("avg of marks " + sum1 / marks.length);

                                                                         //que5:
        System.out.println("reverse order");
        int[] no = {4, 5, 9, 8, 3, 7, 9, 6};
        for (int a = no.length - 1; a >= 0; a--) {
            System.out.print(no[a]);
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println("straight order");
        for (int b = 0; b < no.length; b++) {
            System.out.print(no[b]);
            System.out.print(" ");
        }
                                                                       //que5(again)-

        System.out.println();
        System.out.print("SWAPPING ARRAY -");
        int [] arrayy={9,8,7,6,5,4,3,2,1};
        int l= arrayy.length;
        int n= Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<n;i++) {
            temp = arrayy[i];
            arrayy[i] = arrayy[l - i - 1];
            arrayy[l - i - 1] = temp;
        }
        for(int e:arrayy){
            System.out.print(e+ " ");

        }

                                                                       //que6-
        System.out.println();
        int[] array = {45, 85, 76, 35, 91, 46};
        int min_value = Integer.MIN_VALUE;
        for (int max : array) {
            if (max > min_value) {
                min_value =max ;
            }
        }
        System.out.println("maximum value in this array is " + min_value);
        //que7-

        int[] arr = {45, 85, 76, 35, 91, 46};
        int max_value = Integer.MAX_VALUE;
        for (int min : arr) {
            if (min < max_value) {
                max_value = min;
            }
        }
        System.out.println("minimum value in this array is " + max_value);
                                                                             //que8:-
        boolean is_sorted = true;
        int[] a = {45, 85, 76, 35, 91, 46};
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                is_sorted = false;
                break;
            }
        }
            if(is_sorted) {
                System.out.println("The array is sorted");
            }
        else{
                System.out.println("The array is not sorted");
            }

        }
    }


