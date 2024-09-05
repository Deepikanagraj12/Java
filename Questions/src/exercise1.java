import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {
    System.out.println("enter the marks of student");
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of english out of 100");
        float english= sc.nextFloat();
        System.out.println("enter the marks of maths out of 100");
        float maths= sc.nextFloat();
        System.out.println("enter the marks of science out of 100");
        float science= sc.nextFloat();
        System.out.println("enter the marks of hindi out of 100");
        float hindi= sc.nextFloat();
        System.out.println("enter the marks of social out of 100");
        float social= sc.nextFloat();
        float percentage= ((english+maths+science+hindi+social)/500)*100;
        System.out.println("percentage");
        System.out.println(percentage);
    }
  }
