package array;

public class _11_find_MIN_MAX {
    public static void main(String[] args) {
        int[] array={18,12,7,3,14,28};
        System.out.println(min(array));
    }
    static int min(int[] array){
        int minimum = array[0];
        for(int index=1;index<array.length;index++){
            if(minimum>array[index]){
                minimum=array[index];
            }
        }
        return minimum;
    }
}
