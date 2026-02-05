public class LetCode2169 {
    public static void main(String[] args) {
    int answer=countOperations(10,10);
        System.out.println(answer);
    }
    public static int countOperations(int num1, int num2) {
      return Check(num1,num2,0);
    }
    private static int Check(int num1,int num2,int count){
        if(num1 ==0 || num2 ==0){
            return count;
        }
        if(num1 < num2){
            return Check(num1,num2-num1,count+1);

        }
        return Check(num1-num2,num2,count+1);
    }
}
