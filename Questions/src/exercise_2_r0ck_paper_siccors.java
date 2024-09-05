import java.util.Random;
import java.util.Scanner;
public class exercise_2_r0ck_paper_siccors {
    public static void main(String[] args)
    {
        System.out.println("            enter the number");
        System.out.println("0 for rock, 1 for paper, 2 for scissors");

        Scanner sc=new Scanner(System.in);
        System.out.print("user input= ");
        int num= sc.nextInt();
        int a= sc.nextInt();
        Random rnd =new Random();
        System.out.print("computer input= ");
        int num1= rnd.nextInt(3);
        System.out.println(num1);
        if(num==num1){
            System.out.println("match draw");
        }
        else if(num>num1){
            System.out.println("you won");
        }
        else if(num<num1){
            System.out.println("you lost");
        }
    }
}
