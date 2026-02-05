package Abstract;

public  abstract class Parent {
    public Parent(int age) {
        this.age=age;
    }

    abstract void carrer();
    abstract void Partner();
    int age;

    public void Parent(int age){
        this.age=age;
    }
    static void  hello(){
        System.out.println(" Hey ");
    }
    void normal(){
        System.out.println("I am the normal man");
    }
}
