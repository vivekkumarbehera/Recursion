import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static int sort(int[] arr, int l, int h){
        if(l>=h){
            return l;
        }
        int s= l;
        int e = h;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];
        while(s<=e){
            while (arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        sort(arr,l,e);
        sort(arr,s,h);
        return l;
    }
}
