package inheritance_types;

public class _08_heirarchy {

    public static void main(String[] args) {

        _06_child1 obj1 = new _06_child1();
        System.out.println(obj1.a);
        System.out.println(obj1.y);
        obj1.child1();
        obj1.display();

        _07_child2 obj2 = new _07_child2();
        System.out.println(obj2.a);
        System.out.println(obj2.x);
        obj2.child2();
        obj2.display();
    }
}
