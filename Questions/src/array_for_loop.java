public class array_for_loop {
    public static void main(String[] args) {
        int[] marks = {89, 98, 79, 78};
        //  System.out.println(marks[2]);
                                                         // straight-
     /*   for (int a = 0; a < marks.length; a++) {
            System.out.println(marks[a]);
        }

      */
                                                         //reverse-
   /*     for (int a = marks.length-1 ; a >=0; a--) {
            System.out.println(marks[a]);
        }

    */
                           System.out.println("for-each loop");
                           for (int element: marks){
                               System.out.println(element);
                           }
    }
}
