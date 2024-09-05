package java;

public class shadowing {
    static String a = "deepika";
    public static void main(String[] args) {
        System.out.println(a);
        int a=20;
        System.out.println(a);
    }
}
