import java.util.ArrayList;
import java.util.Arrays;

public class ReturnArray {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int [] arr={1,2,3,4,4,8};
        FindAllIndex(arr,4,0);
        System.out.println(list);

    }
    static void FindAllIndex(int[] arr, int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        FindAllIndex(arr, target, index+1);
    }
}
