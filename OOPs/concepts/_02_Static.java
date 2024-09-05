package concepts;

// everything is in same classs so they can be accessed directly
public class _02_Static {
    static  int a= 10;              // Static variable

                                    //Static method
    static void display(){
        String name ="Static method";
        System.out.println(name);
    }
                                     //Static block
    static {
        System.out.println("Static block");    //this excecutes by default without calling
    }

  /* public static void Car(String[] args) {
        System.out.println(a);
        display();
       }
  */

}
 // Car function is in another class so cannot be accessed directly , have to call by class name
class demomain{
     public static void main(String[] args) {
         System.out.println(_02_Static.a);
         _02_Static. display();
     }
 }