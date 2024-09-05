package Binary_Search;

public class floorofnum {
    public static void main(String[] args) {
        int[] array={1,2,4,5,6,7};
        int target=3;
        System.out.println(floor(array,target));

    }
    // floor=greatest num <= target
 static int floor(int[] array, int target){
        int start=0;
        int end= array.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(array[mid]>target){
                end= mid-1;
            }
            else if(array[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
