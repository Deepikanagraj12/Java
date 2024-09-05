package linked_list;

public class Singly_LL {
    private Node head;
    private Node tail;
    private int size;

    // constructor maintaining size
    public Singly_LL(){
        this.size=0;
    }
                                 // user defined data type node
    private class Node{
       private int value;
       private Node next;
                                  //constructor taking value only
        public Node(int value) {
            this.value = value;
        }
                                     //constructor taking value and address of next node
        public Node(int value, Node next) {
            this.value = value;
            this.next=next;
        }
    }

    public void Display(){
        Node node =head;
        while(node!=null){
            System.out.print(node.value +"->");
            node= node.next;
        }
        System.out.println("end");
    }

    public void insertFirst(int val){
        Node node =new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
          tail=head;
        }
        size++;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node =new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next=node;
        size++;
    }
              public  void deleteFirst() {
                 if(head==null||head.next==null){
                    head=null;
                 }
                 head=head.next;
              }


           public int deleteFirstval(){
            int value= head.value;
             head=head.next;
             if(head==null){
                 tail=null;
             }
             size--;
             return value;
           }

           public Node get(int index){
           Node node=head;
           for(int i=0;i<index;i++){
            node=node.next;
         }
           return node;
      }


    public int deletelast() {
        if (size <= 1) {
            return deleteFirstval();
        }

        Node secondlast = get(size - 2);
        int value=tail.value;
        tail=secondlast;
        tail.next=null;
        size--;
        return value;
    }

    public int deleteanywhere(int index){
        if (index <= 1) {
            return deleteFirstval();
        }
        if(index==size){
            return deletelast();
        }
        Node pre =get(index-1);
        int val=pre.next.value;
        pre.next=pre.next.next;
        size--;
        return val;
    }

}
