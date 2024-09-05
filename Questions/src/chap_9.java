 class employeee{
      private int id;
      private String name;
    public String getname () {return name;}
    public void setname( String a){
        name=a;
    }
    public int getid(){
        return id;
    }
    public void setid( int b){
        id=b;
    }
    }
public class chap_9 {
    public static void main(String[] args) {
  employeee me =new employeee();
  me.setname("deepikanagraj") ;
        System.out.println(me.getname());
  me.setid(45);
        System.out.println(me.getid());
    }
}
