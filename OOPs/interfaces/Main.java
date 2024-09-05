package interfaces;

public class Main {
    public static void main(String[] args) {
     /*   Car car=new Car();
        car.start();
        car.stop();
      */
        AdvanceCar car =new AdvanceCar();
        car.start();
        car.startCD();
        car.upgradeEngine();
        car.stop();
    }
}
