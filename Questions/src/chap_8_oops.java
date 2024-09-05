                                                    // question-1
class employee {
    int salary;
    String name;
    public String get_name(){
        return name;
    }
    public int get_salary(){
        return salary;
    }
    public void set_name( String n ){
        name=n;
    }
}
public class chap_8_oops {
    public static void main(String[] args) {

       employee deepika= new employee();
       deepika.set_name("deepika_nagraj");
       deepika.salary=50000;

        System.out.println(deepika.get_name());
        System.out.println("salary = " + deepika.get_salary());
    }
}
