package concepts;

public class _03_Non_Static {
    int a = 10;

    void display() {
        String name = "deepika";
        System.out.println(name);
    }

    static {
        System.out.println("heyyyy");
    }

}
class demo{
    public static void main(String[] args) {
             //non static method cannot be accessed directly we have to create obj for them
             // and by their obj name they can be accessed
        _03_Non_Static obj= new _03_Non_Static();
        System.out.println(obj.a);
       obj. display();
    }
}
