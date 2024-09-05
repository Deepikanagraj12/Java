package array;

public class _07_maxNo_in_array {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 10, 2, 11};
        System.out.println(maxNo(array));
      }
    static int maxNo(int [] array ){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max=array[i];
            }
        }
        return max;
    }
}

