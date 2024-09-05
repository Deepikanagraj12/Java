package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
     int[] arr={1,2,3,4,5,6};
     int target=5;
        System.out.println(recursion(arr ,target,0, arr.length-1));
    }
    static int recursion(int arr[] , int target, int start, int end ){
        while(start<end){

            int mid= start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(arr[mid]<target){
                return recursion(arr,target,start+1,end);
            }

            else{
                return recursion(arr,target,start,end-1);
            }
        }
        return -1;
    }
}
