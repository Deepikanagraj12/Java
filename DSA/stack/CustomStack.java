package stack;

public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE =10;
    int ptr= -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[DEFAULT_SIZE];
    }

    public boolean push(int item){

        if(isFull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public boolean isFull() {
        return ptr==data.length-1;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("cannot return from an empty Stack");
        }

        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public boolean isEmpty() {
        return ptr==-1;
    }

    public int peak(){
        if(isEmpty()){
            System.out.println("cannot peak from an empty Stack");
        }
        return  data[ptr];
    }

    public void display(){
        for (int i=0;i<ptr;i++){
            System.out.print(data[i]+" ");
        }
    }
}
