public class LetCode1342 {
    public static void main(String[] args) {
      int answer=numberOfSteps(8);
        System.out.println(answer);
    }
    public static int numberOfSteps(int num) {
       return Number(num,0);
    }
    private static int Number(int num,int count){
        if(num == 0){
            return count;
        }
        if (num % 2 == 0){
          return   Number(num/2,count+1);
        }
        return Number(num-1,count+1);
    }
}
