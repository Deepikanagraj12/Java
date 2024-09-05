package concepts;

public class _01_intro {
    public static void main(String[] args) {
        Student deepika= new Student(12,"deepika",89.6f);
        Student deepka= new Student(10,"deepka",79.6f);
        System.out.println(deepika.name);
        System.out.println(deepika.rollno);
        System.out.println(deepika.marks);
        Student deep=new Student();
        System.out.println(deep.name);
        Student.student();
        System.out.println(Student.students);

    }
}
 class Student {
    int rollno;
    String name;
    float marks;
    static int students;
                   // default constructure
    Student(){ }
                   // parametarized constructure 
  Student(int rollno,String name, float marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
        Student.students +=1;
    }
                  //method in class
     static void student(){
        String name = "deepika";
         System.out.println(name);
     }
}
