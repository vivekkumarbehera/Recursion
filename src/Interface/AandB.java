package Interface;

public class AandB implements B{
    @Override
    public void great() {
        System.out.println("Welcome Gentelman");
    }

    @Override
    public void welcome() {
        System.out.println("Hello Sir");

    }
}
