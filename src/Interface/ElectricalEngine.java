package Interface;

public class ElectricalEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Start the Electrical Car");
    }

    @Override
    public void stop() {
        System.out.println("Stop the Electrical Car");

    }

    @Override
    public void acc() {
        System.out.println("Accelerate the Electrical Car");
    }
}
