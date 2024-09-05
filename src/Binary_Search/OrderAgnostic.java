package Binary_Search;

public class OrderAgnostic {
    public static void main(String[] args) {
     //   int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
      int[] array = {9, 8, 7, 6, 5, 4, 3};
        int target = 8;
        int ans = orderAgnosticBS(array, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        boolean isAscending =array[start] < array[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (isAscending) {
                if (array[mid] < target) {
                    start = mid + 1;
                }
                else  {
                    end = mid - 1;
                }
            }

            else {
                if (array[mid] > target) {
                    start = mid + 1;
                } else  {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
