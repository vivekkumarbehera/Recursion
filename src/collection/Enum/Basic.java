package collection.Enum;

public class Basic {
    enum  week{
        mon,tues,wed,thurs,fri,satur,sun
        //by default static ,final,public
        //object not created because it final

    }

    public static void main(String[] args) {
        week w;
        for (week day : week.values()){
            System.out.println(day);
        }
        System.out.println();
    }
}
