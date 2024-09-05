public class practice_set_ch_7_que1 {
    static void table(int a){
        System.out.println("\t Table of " + a +" - ");
        for(int n=1;n<=10;n++) {
            System.out.format ("%d * %d = %d  \n" , a, n, n * a );
        }
    }
    public static void main(String[] args) {
        table(5);
        table(6);
        table(7);

    }
}
