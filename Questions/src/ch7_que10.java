public class ch7_que10 {
    static int natural(int a){
        int  sum=0;
        for(int i=0; i<a; i++){
            sum= a+natural(a-1);
        }
      return sum;
    }

    public static void main(String[] args) {
        System.out.println(natural(10));
    }
}
