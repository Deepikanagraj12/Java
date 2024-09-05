package Binary_Search;

public class implimentation {
    public static void main(String args[]) {
         int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 7;
        int ans = binarySearch(array, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] < target) {
                start = mid + 1;
            } else if (array[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
            return -1;

    }
}




