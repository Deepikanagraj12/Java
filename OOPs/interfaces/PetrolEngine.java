package interfaces;

public class PetrolEngine implements Engine{

    @Override
    public void start() {
        System.out.println("petrol engine start");
    }

    @Override
    public void stop() {
        System.out.println("petrol engine stop");
    }
}
