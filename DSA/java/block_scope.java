package java;

public class block_scope {
    public static void main(String[] args) {
        String name= "deepika";
        {
            name="deep";
            int a= 20;    //anything initialize in the block will remain in the block only
        }
        int a=30;
        System.out.println(name);
        System.out.println(a);
    }
}
