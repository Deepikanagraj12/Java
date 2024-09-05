package interfaces;

public class CDPlayer implements MultiMedia{
    @Override
    public void start() {
        System.out.println("start cd player");
    }

    @Override
    public void stop() {
        System.out.println("stop cd player");
    }
}
