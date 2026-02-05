import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetCode442 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        LetCode442 obj = new LetCode442(); // Create object to call non-static method
        List<Integer> duplicates = obj.findDuplicates(nums);
        System.out.println(duplicates);


    }
    public List<Integer> findDuplicates(int[] nums) {
        //Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        int Unique=0;
         for (int n : nums){
             Unique ^= n;
             result.add(Unique);
        }
        return result;
    }
}
