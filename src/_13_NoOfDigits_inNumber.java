public class _13_NoOfDigits_inNumber {
    public static void main(String[] args) {
        int[] array={23,123,3456,23456,11111};
        int ans=EvenNumbers(array);
        System.out.println(ans);
    }
    static int EvenNumbers(int[] array){
        int count=0;
        //    for(int element:array) {
        //   if (even(element));
       //    count++;
       //              }
        for(int i=0;i< array.length;i++) {
            if (even(array[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even(int array){
        int numberofDigits=digits(array);
        if(numberofDigits%2==0){
            return true;
        }
        return false;
    }
    static int digits(int array){
        if(array<0){
            array= array*-1;
        }
        if(array==0){
            return 1;
        }
        int count=0;
        while(array>0){
            count++;
            array/=2;
        }
        return count;
    }
}
