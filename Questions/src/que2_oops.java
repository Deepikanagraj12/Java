class cellphone{
    public void ring(){
        System.out.println(" ringing....");
    }
    public void vibrate(){
        System.out.println(" vibrating....");
    }
    public void call(){
        System.out.println(" calling Deepika....");
    }
}
public class que2_oops {
    public static void main(String[] args) {
       cellphone realme= new cellphone();
       realme.ring();
       realme.vibrate();
       realme.call();
    }
}
