package Abstract;

public class Son extends Parent  {
    public Son(int age) {
        super(age);
    }

    @Override
    void carrer() {
        System.out.println("I want to become the coder");
    }

    @Override
    void Partner() {
        System.out.println("I want to be a good partner");

    }
}
