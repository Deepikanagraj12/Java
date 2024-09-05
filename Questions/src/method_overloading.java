public class method_overloading {
    /*
    static void num1(){

        System.out.println("hey");
    }
    static void num1(char a){
        System.out.println("hey " + a);
    }
    static void num1(char a,char b , char c ,char d){
        System.out.println("hey " + a + b+ c+ d);
    }

    public static void main(String[] args) {
       num1();
       num1('d');
       num1('d' , 'e' , 'e' ,'p');

}
                                                  // array
     */
           static void array (int [] arr){
           arr[1] = 0;

    }

    public static void main(String[] args) {
        int[] array1 = {7, 6, 9, 5, 3};
        array(array1);
        System.out.println(array1[1]);
    }
}


