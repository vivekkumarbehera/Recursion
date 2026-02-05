public class SumOfProduct {
    public static void main(String[] args) {
        System.out.println(pro(15));
    }
    static int pro(int n){
        if(n%10==n){
            return n;
        }
        return n%10*pro(n/10);
    }
}
