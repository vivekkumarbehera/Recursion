public class BinarrySearchLec02 {
    public static void main(String[] args) {
         int arr[]={11,22,33,44,55,66};
         int target=33;
        System.out.println(bin(arr,0, arr.length-1,target));
    }
    static int bin(int []arr,int start,int end,int target){
        if(start > end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(target==arr[mid]){
            return mid;
        }
        if (target<arr[mid]){
            return bin(arr,start,mid-1,target);
        }
        return bin(arr,mid+1,end,target);
    }
}
