public class PalindromNumber {
    public static void main(String[] args) {
        int num=1241;
        System.out.println(CRev(num));

    }
    static int sum =0;
    static int Rev(int num){
        if (num <=0){
            return 0;
        }
        sum=sum*10+num%10;
        Rev(num/10);
        return num;
    }
   public static String CRev(int num){
        if(Rev(num)==num){
            return "it is a palindrom";
        }
        return "it is not palindrom";
    }
}