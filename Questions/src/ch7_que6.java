public class ch7_que6 {
    static float avg(float ...arr) {
        float sum = 0;

        for (float e:arr) {
            sum = sum + e;
        }
            float a = sum / arr.length;
            return a;
        }

    public static void main(String[] args) {

        System.out.println( avg(4,5,8));
    }
}
