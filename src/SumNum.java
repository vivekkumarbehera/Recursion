public class SumNum {
    public static void main(String[] args) {
        int ans=AllNum(5);
        System.out.println(ans);
    }
    static  int AllNum(int n){
        if (n<=1){
            return 1;
        }
        return n+AllNum(n-1);
    }
}
