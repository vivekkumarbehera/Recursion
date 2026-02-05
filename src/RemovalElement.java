import java.util.Arrays;

public class RemovalElement {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));


    }
    public static int removeDuplicates(int[] nums) {
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j - 1] < nums[j]) {
                    int temp = 0;
                    temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int num:nums){
            int result=0;
            result ^= num;
            return result;
        }
        return -1;
    }
}
