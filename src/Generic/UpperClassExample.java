package Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperClassExample {//for the use case of the Visualization pf the data
    public static void SumNumber(List<? extends Number> list){
        double sum =0;
        for(Number num : list ){
            sum += num.doubleValue();
        }
        System.out.println("sum ="+sum);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10,20,30);
        List<Double>   doubles=Arrays.asList(1.2,1.3,2.3);
        SumNumber(integers);
        SumNumber(doubles);
    }
}
