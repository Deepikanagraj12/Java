import java.util.Scanner;

public class _09_linear_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array= {9,6,3,1,4,8,7};
        int target= sc.nextInt();
        int ans =LinearSearch(array,target);
        System.out.println(ans);

    }
    static int LinearSearch(int[] array, int target){
        if (array.length==0){
            return -1;
        }
        for(int index=0;index< array.length;index++){
            int element =array[index];
            if(element==target){
                return index;
            }
        }
        //if element does found
        return -1;
    }
}
