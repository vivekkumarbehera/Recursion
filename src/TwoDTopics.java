import java.util.ArrayList;

public class TwoDTopics {
    public static void main(String[] args) {
       // System.out.println(num(3,3));
        System.out.println(path("",3,3));
    }
    public static int num(int row,int column){
        if(row==1 || column ==1){
            return 1;
        }
        int left=num(row-1,column);
        int right=num(row,column-1);
        return left+right;

    }
    public static ArrayList<String>  path(String p,int r,int l){
        if(r==1 || l==1){
            ArrayList<String> List=new ArrayList<>();
            List.add(p);
            return List;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1 && l>1){
            list.addAll(path(p+"D",r-1,l-1));
        }
        if(r>1){
          list.addAll(path(p+'V',r-1,l));
        }
        if(l>1){
         list.addAll(   path(p+"H",r,l-1));
        }
        return list;
    }
}
