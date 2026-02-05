public class SubSequence {
    public static void main(String[] args) {
        SkipStr("","abc");
    }
    static void SkipStr(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        SkipStr(p+ch,up.substring(1));//take the character
        SkipStr(p,up.substring(1));//skip the character
    }
}
/*
          ""
        /    \
      "a"     ""
     /  \     /  \
   "ab" "a" "b"   ""
   / \   / \  / \  / \
 abc ab ac a bc b c  ""

 */