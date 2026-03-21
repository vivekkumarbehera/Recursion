package LinkList;

public class MiddleNumber {
    private Listnode head;
    private Listnode tail;
    private int size ;
    public MiddleNumber(){
        this.size =0 ;
    }
    public void InsertFirst(int val){
        Listnode node = new Listnode(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size +=1;
    }
    public void  InsertLast(int val){
        if (tail == null){
            InsertFirst(val);
            return;
        }
        Listnode node = new Listnode(val);
        tail.next =node;
        tail = node;
        size += 1;
    }
    public void insert(int val, int index){
        if (index == 0){
            InsertFirst(val);
            return;
        }
        if(index == size){
            InsertLast(val);
            return ;
        }
        Listnode temp = head;
        for (int i = 0; i <index ; i++) {
            temp =temp.next;
        }
        Listnode node = new Listnode(val,temp.next);
        temp.next = node;
        size += 1;
    }
    public Listnode middleNode(Listnode head) {
        if (head == null) return null;

        Listnode slow = head;
        Listnode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow will be at the middle
    }





    private    class Listnode
{
private  int value;
private Listnode next;
public Listnode(int value,Listnode next){
    this.value=value;
    this.next=next;
}
public Listnode(int value){
    this.value=value;
}
}

}
