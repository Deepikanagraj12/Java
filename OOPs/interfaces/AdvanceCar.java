package interfaces;

public class AdvanceCar {
    private  Engine engine=new DieselEngine();
    private MultiMedia cdPlayer= new CDPlayer();

    void start(){
        engine.start();
    }
    void stop(){
        engine.stop();
    }
    void startCD(){
        cdPlayer.start();
    }
    void stopCD(){
        cdPlayer.stop();
    }
    void upgradeEngine(){
        this.engine =new PetrolEngine();
    }
}
