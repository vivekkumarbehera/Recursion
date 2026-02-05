import java.util.ArrayList;

public class PhoneCallSubSequence {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
    public static ArrayList<String> letterCombinations(String digits) {
        if (digits.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
      return Paide("",digits);
    }

    private static ArrayList<String> Paide(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        ArrayList<String> list=new ArrayList<>();
        int count=0;
        for (int i = (digit-1)*3; i <digit*3; i++) {
            char ch = (char)('a'+i);
            list.addAll(count,Paide(p+ch,up.substring(1)));
        }
        return list;
    }
}
