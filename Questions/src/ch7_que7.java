public class ch7_que7 {
    static void pattern(int a){
        pattern(a-1);
        if (a>0){
            for(int i=1 ; i<a ; i++){
                System.out.println("*");

            }

        }
    }

    public static void main(String[] args) {

    }
}

