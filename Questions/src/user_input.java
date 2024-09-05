    import java.util.Scanner;
    public class user_input {
        public static void main(String[] args)
        {
           System.out.println("taking input from user");
            Scanner sc = new Scanner(System.in);
           System.out.println("enter num1");
            int a= sc.nextInt();
          System.out.println("enter num2");
            int b= sc.nextInt();
            int substract = a-b;
            System.out.println("the substraction of these numbers");
            System.out.println(substract);

    }
}
