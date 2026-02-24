package Interface;

public class PowerEnigine implements Engine{

    @Override
    public void start() {
        System.out.println("Start the PowerCarEngine");
    }

    @Override
    public void stop() {
        System.out.println("Stop the PowerCar Engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate the PowerCar");
    }
}
