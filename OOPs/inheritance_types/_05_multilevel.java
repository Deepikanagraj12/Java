package inheritance_types;

public class _05_multilevel {
    public static void main(String[] args) {
        _04_grandChild object=new _04_grandChild();
        System.out.println(object.a);
        System.out.println(object.b);
        System.out.println(object.c);
        object.show();
        object.display();
        object.print();
    }
}
