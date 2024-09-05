
public class counting_occurence {
    public static void main(String[] args) {

     /*   int n= 1414;
        int var= 4;
        int count=0;

        while(n>0){
            int rem = n%10 ;
            if (rem == var){
                count++;
            }
            n= n/10;
        }
        System.out.println(count);
    }

   */

        int n = 1234;
        int ans = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            ans = ans*10+rem;
        }
        System.out.println(ans);
    }
}

