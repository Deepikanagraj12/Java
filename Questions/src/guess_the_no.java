import java.util.Random;
import java.util.Scanner;
class constructor{
    private int num ;
public constructor(){
 }
}
public class guess_the_no {
    public static void main(String[] args) {
        System.out.println("guess the no. ");
        Scanner guess = new Scanner(System.in);
        Random rnd =new Random();
        int a= guess.nextInt();
        int b= rnd.nextInt(100);
        System.out.println(b);
    }
}
