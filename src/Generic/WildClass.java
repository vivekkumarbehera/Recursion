package Generic;
import java.util.*;

public class WildClass {// in there whatever case you have to use
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World");
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        printList(strings);  // works with List<String>
        printList(numbers);  // works with List<Integer>
    }

}
