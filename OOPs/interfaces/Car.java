package interfaces;

public class Car implements Engine,MultiMedia {
    @Override
    public void start() {
        System.out.println("starting");
    }

    @Override
    public void stop() {
        System.out.println("stoping");

    }
}
