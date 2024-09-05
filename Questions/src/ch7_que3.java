public class ch7_que3 {
    static int sum(int a){
       if(a==1 ){
           return 1;
       }
       else {
           return  a + sum(a - 1);
       }
    }
    public static void main(String[] args) {

        System.out.println(sum(3));
    }
}
