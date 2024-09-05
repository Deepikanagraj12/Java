package polymorphism;

public class Static_poly {
    int sum (int a, int b){
        return a+b;
    }
    int sum (int a, int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Static_poly obj= new Static_poly();
        System.out.println(obj.sum(1,3));
        System.out.println(obj.sum(1,2,3));
    }
}
