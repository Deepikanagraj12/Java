package trees;
import  java.util.Scanner;

 class BinaryTree {

     public BinaryTree(){
     }
     private static class Node{
         int value;
         Node left;
         Node right;
         public Node (int value){
             this.value = value;
         }
     }

     private Node root ;

     public void populate(Scanner scanner){
         System.out.println("Enter value of root element :");
         int value = scanner.nextInt();
         this.root = new Node(value);
         populate(scanner , this.root);
     }

     private void populate(Scanner scanner , Node node){
         System.out.println("do yoy want to enter left of "+node.value);
         boolean left = scanner.nextBoolean();

         if(left){
             System.out.println("Enter the value of left of " +node.value);
             int value = scanner.nextInt();
             node.left =new Node(value);
             populate(scanner,node.left);
         }

         System.out.println("do yoy want to enter right of "+node.value);
         boolean right = scanner.nextBoolean();

         if(right){
             System.out.println("Enter the value of right of " +node.value);
             int value = scanner.nextInt();
             node.right =new Node(value);
             populate(scanner,node.right);
         }
     }

}
