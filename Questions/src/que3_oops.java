class square {
    int side;
    public int area() {
        return side * side;
    }
    public int perimeter() {
        return 4 * side;
    }
}
public class que3_oops {
    public static void main(String[] args) {
    square abcd= new square();
    abcd.side=5;
        System.out.println(abcd.area() + " cm^2");
        System.out.println(abcd.perimeter() + " cm");
    }
}
