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
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        node node = new node(val);
        tail.next=node;
        tail=node;
        size++;

    }
    public void insert(int val , int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }
        node temp = head;
        for (int i = 0; i <index ; i++) {
            temp= temp.next;
        }
        node node= new node(val,temp.next);
        temp.next = node;
        size++;
    }
    public int firstvaluerempove(){
        int value= head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return  value;
    }
    public node reverseRecursive(node head){
        if(head==null || head.next==null){
            return head;
        }
      node newhead=  reverseRecursive(head.next);
      head.next.next=head;
      head.next=null;
      return newhead;




    }
    public void insertion(int val,int index){
      head=insertion(val,index,head);
    }
    private node insertion(int val,int index,node node)
    {
        if(index == 0){
            node temp = new node(val,node);
            size ++;
            return temp;


        }
        node.next = insertion(val,index--,node.next);
        return  node;
    }







    public void display(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ->  ");
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
