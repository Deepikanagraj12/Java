package inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(box1.l);

        Box box2 = new Box(81,82,83);
        System.out.println(box2.l);

        Box box3 = new Box(2);
        System.out.println(box3.l);

        Box box4= new Box(21,2,35);
        System.out.println(box4.l);

        Box box5= new Box(box1);
        System.out.println(box5.l);

        child_box box6 =new child_box();
        System.out.println(box6.h +" "+ box6.weight);

        child_box box7 =new child_box(2,3,4,5);
        System.out.println(box7.h +" "+ box7.weight);

        Box box8 =new child_box(12,13,14,15);
        System.out.println(box8.h);
      //  System.out.println(box8.weight);  //cannot be accessed bcoz they are in chlid class


    }
}

