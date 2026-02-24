package Interface;

public class NewCar {
    private Engine engine;
    private Media player=new MyCdPlayer();
    public NewCar(Engine engine){
        this.engine=engine;
    }
    public void start(){

        engine.start();
    }
    public void Media(){
        player.start();
    }
    public void PowerEngine(ElectricalEngine engine){
        this.engine=new ElectricalEngine();
    }
    public NewCar() {
        this.engine = new ElectricalEngine(); // or some default engine
        engine.start();
    }


}
