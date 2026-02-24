package Generic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TypeSaftey<Integer> T1 = new TypeSaftey<>();
        T1.set(100);
        TypeSaftey<String> T2 = new TypeSaftey<>();
        T2.set("Hello");
        System.out.println(T1);
    }
}
