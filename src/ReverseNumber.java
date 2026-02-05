public class ReverseNumber {
    public static void main(String[] args) {
        int reversed = Rever(-321);
        System.out.println(reversed);
    }

        public static int Rever(int num) {
        return Rev(num, 0);
    }

    private static int Rev(int num, int sum) {
        if (num == 0) {
            return sum;
        }
        return Rev(num / 10, sum * 10 + num % 10);
    }
}