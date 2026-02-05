public class BitEvenOrOdd {
    public static void main(String[] args) {
        System.out.println(number(5));
    }
    public static String number(int n){
        if ((n&1)==1) {
            return "the number is odd";
        }
        return "even";
    }

}
