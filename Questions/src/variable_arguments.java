public class variable_arguments {
    static int multiply (int ...arr){
        int multiplication =1;
        for(int a:arr){
          multiplication *= a;
        }
        return multiplication;
    }

    public static void main(String[] args) {
        System.out.println( multiply(2,2));
        System.out.println( multiply(2,2,2));
        System.out.println( multiply(2,2,2,2));
        System.out.println( multiply(2,2,2,2,2));
    }
}

