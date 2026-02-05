package Abstract;

public class Daughter extends Parent {
    public Daughter(int age){
        super(age);
    }
    @Override
    void carrer() {
        System.out.println("I want to become the IAS officer");
    }

    @Override
    void Partner() {
        System.out.println("I want also be a good man");

    }
}
