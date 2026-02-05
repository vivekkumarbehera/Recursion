public class StoE {
    public static void main(String[] args) {
     num(5);
    }
    static void num(int n){
        if (n ==0){
            return;
        }
        System.out.println(n);
        num(n-1);
    }
    static void RevNum(int n){
        if(n==0){
            return;
        }
        RevNum(n-1);
        System.out.println(n);
    }
}
