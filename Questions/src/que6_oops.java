
class circle {
    float radius;
    float pie=3.14f;
    public float area() {
        return pie * radius* radius;
    }
    public float perimeter() {
        return 2*pie*radius;
    }
}
public class que6_oops {
    public static void main(String[] args) {
        circle cir = new circle ();
       cir.radius=4f;
        System.out.println(cir.area() + " cm^2");
        System.out.println(cir.perimeter() + " cm");
    }
}

