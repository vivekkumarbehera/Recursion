package Generic;

public class CustomerArrayList {
    private int[] data;
    private static int default_size=10;
    private int size= 0;
    public CustomerArrayList(){
        this.data=new int[default_size];
        
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int [] temp=new int[data.length*2];
        for (int i = 0; i < data.length ; i++) {
            temp[i]=data[i];

        }
        data=temp;
    }

    private boolean isFull() {
        return size== data.length;
    }

    public static void main(String[] args) {

    }
}
