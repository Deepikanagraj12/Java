import java.util.Scanner;
public class cgpa_calculate {
    public static void main(String[]args){
        System.out.println("enter the marks of student out of 100");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of DSA out of 100");
        float a= sc.nextFloat();
        System.out.println("enter the marks of DCD out of 100");
        float b= sc.nextFloat();
        System.out.println("enter the marks of EDC out of 100");
        float c= sc.nextFloat();
        System.out.println("enter the marks of DIS ST. out of 100");
        float d= sc.nextFloat();
        System.out.println("enter the marks of CSO out of 100");
        float e= sc.nextFloat();
        float CGPA= ((a+b+c+d+e)/30);
        System.out.println("CGPA of student best of three");
        System.out.println(CGPA);
    }

}
