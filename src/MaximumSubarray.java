public class MaximumSubarray {
    public static void main(String[] args) {
     int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public  static int maxSubArray(int[] nums) {
        return sort(nums, 0, nums.length - 1);
    }

    private static int sort(int[] arr, int l, int h) {
        if (l >= h) {
            return l;
        }
        int s = l;
        int e = h;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];
        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sort(arr, l, e);
        sort(arr, s, h);
        return Math.max(s,l);
    }

}

