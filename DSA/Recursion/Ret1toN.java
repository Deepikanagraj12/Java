package Recursion;

public class Ret1toN {
    public static void main(String[] args) {
       printNos(10);
    }

   static void printNos(int N)
    {
        if(N==0){
            return;
        }
        printNos(N-1);
        System.out.print(N +" ");
    }
}
