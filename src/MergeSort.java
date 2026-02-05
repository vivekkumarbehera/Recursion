import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        arr=Sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[]  Sort(int [] arr1){
        if(arr1.length==1){
            return arr1;
        }
        int mid= arr1.length/2;
        int[] start=Sort(Arrays.copyOfRange(arr1,0,mid));
        int[] end=Sort(Arrays.copyOfRange(arr1,mid,arr1.length));
        return merge(start,end);
    }
    private static int[] merge(int[] first, int[] second){
        int [] mix=new int[first.length+ second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i< first.length && j < second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else {
            mix[k]=second[j];
            j++;}
            k++;
        }
        while (i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while (j< second.length){
            mix[k]=first[j];
            j++;
            k++;
        }
        return mix;
    }
}
