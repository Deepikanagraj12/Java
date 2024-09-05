package Recursion;

public class fibonacci {
    public static void main(String[] args) {
        int n=6;
        System.out.println(recursiveFibo(n));

    }
    static int recursiveFibo(int n){
        if(n==0||n==1){
            return n;
        }
        else{
            return recursiveFibo(n-1)+recursiveFibo(n-2);
        }
    }
}
