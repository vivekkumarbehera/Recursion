public class SortedArrayCheck {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(Sorted(arr,0));
    }
    static boolean Sorted(int []num,int index){
        if (index== num.length-1){
            return true;
        }
        return num[index] < num[index+1] && Sorted(num,index+1);
    }
}
