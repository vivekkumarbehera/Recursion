import java.util.ArrayList;

public class SubseqASCII {
    public static void main(String[] args) {
       // SkipStr("","abc");
        System.out.println(subSeqRet("","abc"));
    }
    static void SkipStr(String p,String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        SkipStr(p + ch, up.substring(1));
        SkipStr(p, up.substring(1));
        SkipStr(p+(ch+0),up.substring(1));
    }
    static ArrayList<String> subSeqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        // ArrayList<String> list=new ArrayList<>();
        char ch = up.charAt(0);
        ArrayList<String> left= subSeqRet(p+ch,up.substring(1));
        ArrayList<String> right=subSeqRet(p,up.substring(1));
        ArrayList<String> top=subSeqRet(p+(ch+0),up.substring(1));
        left.addAll(right);
        left.addAll(top);
        return left;
    }
}
