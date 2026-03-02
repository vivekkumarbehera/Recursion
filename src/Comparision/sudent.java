package Comparision;

import org.jetbrains.annotations.NotNull;

public class sudent implements Comparable<sudent>{
    int rollno;
    int marks;
    public sudent(int rollno,int marks){
        this.rollno=rollno;
        this.marks=marks;

    }



    @Override
    public int compareTo(@NotNull sudent o) {
        int diff=(int)(this.marks-o.marks);
        return 0;
    }
}
