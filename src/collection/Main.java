package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        list2.add(12);
        list2.add(23);
        System.out.println(list2);
        list2.stream().sorted();
        System.out.println(list2);
    }
}
