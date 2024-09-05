
import java.util.Scanner;
public class tax_calculation {
    public static void main(String[] args) {
        System.out.println("enter income");
        Scanner sc = new Scanner(System.in);
        int tax = 0;
        float income = sc.nextFloat();
        if (income <= 250000)
        {
            System.out.println("tax= " + tax);
        }
        else if (income >= 250000 && income < 500000)
        {
            System.out.println("tax= " + 5 / 100f * income);
        }
        else if (income >= 500000 && income <= 1000000)
        {
            System.out.println("tax= " + 20 / 100f * income);
        }
        else if (income > 1000000)
        {
            System.out.println("tax= " + 30 / 100f * income);
        }

    }
}



