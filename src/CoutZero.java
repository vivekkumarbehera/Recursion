public class CoutZero {
    public static void main(String[] args) {
        System.out.println(Count(10340));
    }
    static int Count(int count){

        return Helper(count,0);
    }
    private static int Helper(int count,int c){
        if(count == 0){
            return c;
        }
        int rem= count % 10;
        if (rem == 0){
            return Helper(count/10,c+1);
        }
        return Helper(count/10,c);
    }
}
