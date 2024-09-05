
import java.util.Scanner;
public class convert {
    public static void main(String[]args)
    {
        System.out.println("cnverting km to miles");
        Scanner sc= new Scanner(System.in);
        System.out.println("kilometer");
        double km= sc.nextInt();

        double miles= km*0.62137;
        System.out.print(miles);
        System.out.println(" miles");

    }
}

