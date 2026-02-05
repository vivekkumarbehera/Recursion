import java.util.Arrays;

public class SquareOfSorted977 {
    public static void main(String[] args) {
      int nums[]={-4,-1,0,3,10};
      int[] result=nums;
        System.out.println(sortedSquares(result));

    }
    public static int[] sortedSquares(int[] nums) {
        int temp=0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]>nums[i+1]){
                temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;

            }
            System.out.print(i*i);
        }
        return nums;
    }
}
