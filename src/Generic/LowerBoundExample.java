package Generic;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundExample {//here there we can the write operation
    private static List<? super Integer> Integers;

    public static void addNumber(List<? super Integer>list){
        list.add(10);
        list.add(20);
        System.out.println();
    }








    public static void main(String[] args) {
      List<Integer> integers=new ArrayList<>();
      List<Number> numbers=new ArrayList<>();
      addNumber(Integers);
      addNumber(numbers);
    }
}
