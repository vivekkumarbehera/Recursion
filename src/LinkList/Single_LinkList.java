package LinkList;

public class Single_LinkList {
    private node head;
    private node tail;
    private int size;
    public Single_LinkList(){
        this.size=0;
    }
    public void insertFirst(int val){
        node node = new node(val);
        node.next=head;
        head=node;
        if (tail== null){
            tail=head;
        }
        size += 1;
    }
    public void display(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.value);
            temp=temp.next;
        }
        System.out.println("END");
    }


    private class  node{
       private int value;
       private node next;


        public node(int value, node next) {
            this.value = value;
            this.next = next;
        }
        public node(int value){
            this.value=value;
        }
    }


}
