public class IthBit {
    public static void main(String[] args) {
        System.out.println(num(182));
    }
    public static int num(int n){
        return n & (1 << n-1);
    }
}
