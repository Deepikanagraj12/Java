public class ch7_que2 {
static void pattern(int a){
  for (int i=1;i<a;i++) {
      for(int j=1;j<=i;j++){
          System.out.print("*");
      }
      System.out.println("\n");
  }
}
    public static void main(String[] args) {
    pattern(5);
    pattern(10);
    }
}
