public class SumOfUnique {
    public static void main(String[] args) {
        int nums[]={1,3,4,2,2};
        System.out.println(sumOfUnique(nums));
    }
    public static int sumOfUnique(int[] nums) {

        int unique = 0;
        for (int n : nums) {
            //unique = 0;
            unique ^= n;
            //unique += unique;
        }
        return unique;
    }

}
