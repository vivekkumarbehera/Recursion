package Interface;

public interface A {
    void great();
    // in the Staticc we cant leave withut body
    static void warn(){
        System.out.println("How dare you run the Static ");
    }
    default void car(){
        System.out.println("I am the Car and Iam the default one ");
    }
}
