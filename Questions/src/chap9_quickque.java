class circle1{
    int radius;
   private int circumference;
    public int getCircumference(){

        return circumference;
    }
    public void setCircumference(int i){
        circumference= i ;
    }
}
public class chap9_quickque {
    public static void main(String[] args) {
        circle1 cir = new circle1();
        cir.getCircumference();
        System.out.println(cir.getCircumference());



    }
}
