public class SortedArray {
    public static void main(String[] args) {
        int [] arr= {12,3,4,15,2,1};
        int target=4;
        System.out.println(Find(arr,target,0));

    }
    static int Find(int [] arr,int target,int index){
        if(index == arr.length-1) {
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        return Find(arr, target, index+1);
    }
}
