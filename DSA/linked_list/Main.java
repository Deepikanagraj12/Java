package linked_list;

public class Main {
    public static void main(String[] args) {
        Singly_LL list = new Singly_LL();

        list.insertFirst(8);
        list.insertFirst(4);
        list.insertFirst(9);
        list.insertFirst(5);
        list.insertFirst(7);

        list.insertLast(123);
        list.insert(10,3);

        list.Display();

 //       list.deleteFirst();
        list.deleteFirstval();
        list.deletelast();
        list.deleteanywhere(2);
        list.Display();

    }
}
