public class chap7_method {
    static int method(int a, int b) {
     int c=a+b;
     return c;
    }
    public static void main(String[] args) {
        int p=40;
        int q=88;
        int r;
        r=method(p,q);
        System.out.println(r);

        int x=54;
        int y=68;
        int z=method(x,y);
        System.out.println(z);


    }
}

