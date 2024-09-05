public class ch7_que4 {
    static void pattern(int a) {
        for (int i = 0; i <= a; i++) {
            for (int j=a; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       pattern(5);
        pattern(10);
    }
}

