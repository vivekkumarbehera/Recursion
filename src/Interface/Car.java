package Interface;

public class Car implements Engine,Media,Brake {

    @Override
    public void brake() {
        System.out.println("Break the Car");
    }

    @Override
    public void start() {
        System.out.println("Start the car");

    }

    @Override
    public void stop() {
        System.out.println("Stop the car !!!");

    }

    @Override
    public void acc() {
        System.out.println("Speed up the car");

    }


}
