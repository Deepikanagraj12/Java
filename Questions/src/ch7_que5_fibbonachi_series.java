public class ch7_que5_fibbonachi_series {
    static int fibo(int a) {
        if (a==1){
            return 0;
        } else if (a==2) {
            return 1;
        } else {
            return fibo(a-1)+ fibo(a-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(fibo(8));
    }
}