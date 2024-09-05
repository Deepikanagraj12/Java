class animal{
    String cat;
    public String getcat(){
        return cat;
    }
    public void setcat(String dog){
        System.out.println("hey! I'm katty 🐶");
        this.cat= cat;
    }
    public void printme(){
        System.out.println("i am a constructor ");
    }
   class Derived extends animal{
       String dog;
       public String getdog(){
           return dog;
       }
       public void setdog(String dog){
           System.out.println("hey! I'm dog bruno 🐶");
           this.dog= dog;
       }

    }
}
public class inheritence {
    public static void main(String[] args) {
        animal a = new animal();
        a.setcat("drink milk");
        System.out.println(a.getcat());

    }
}

