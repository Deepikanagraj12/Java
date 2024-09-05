package stack;

public class Main {
    public static void main(String[] args) {
         CustomStack stack =new CustomStack(5);

         stack.push(1);
         stack.push(2);
         stack.push(3);
         stack.push(4);
         stack.push(5);
         stack.pop();
         stack.display();

    }
}
