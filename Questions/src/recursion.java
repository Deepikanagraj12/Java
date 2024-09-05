public class recursion {
    static int factorial(int a) {
        if (a == 0 || a == 1) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }

            public static  void main (String [] args){
                int n=6;
                System.out.println(factorial(n));
            }

        }



