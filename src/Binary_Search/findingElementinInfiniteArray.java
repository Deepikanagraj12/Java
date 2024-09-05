package Binary_Search;

public class findingElementinInfiniteArray {
    public static void main(String[] args) {
        int array[]={1,2,4,5,6,7,8,9,12,13,14,15,15,60};
        int target=8;
        System.out.println(ans(array,target));
    }
    static int ans(int array[],int target){
        int start=0;
        int end=1;
        while(array[end]<target){
           int newStart=end+1;
           end=end+(end-start+1)*2;
           start=newStart;
        }
        return binary_search(array,target,start,end);
    }

   static int binary_search(int array[],int target,int start,int end){
        while( start<=end){
            int mid = start+(end-start)/2;
            if(array[mid]>target){
                end=mid-1;
            }
            else if(array[mid]<target){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
