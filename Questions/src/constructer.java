class myworker{
    private int id;
    private String name;
    private int salary;

    public myworker() {
        name = "Ayushi";
        id = 45;
        salary = 50000;
    }

    public String getname() {
        return name;
    }

    public void setname(String a) {
        name = a;
    }

    public int getid() {
        return id;
    }

    public void setid(int b) {
        id = b;
    }

    public int getsalary() {
        return salary;
    }

    public void setSalary(int c) {
        salary = c;
    }
}
public class constructer {
    public static void main(String[] args) {
        myworker deepika = new myworker();
        System.out.println("name = " + deepika.getname());
        System.out.println("id = " + deepika.getid());
        System.out.println("salary = " +deepika.getsalary());
    }
}

