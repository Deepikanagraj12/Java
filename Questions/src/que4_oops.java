class rectangle {
    int length,breadth;
    public int area() {
        return length*breadth;
    }
    public int perimeter() {
        return 2* (length+breadth);
    }
}
public class que4_oops {
    public static void main(String[] args) {
        rectangle rect = new rectangle();
        rect.length=5;
        rect.breadth=6;
        System.out.println(rect.area() + " cm^2");
        System.out.println(rect.perimeter() + " cm");
    }
}


