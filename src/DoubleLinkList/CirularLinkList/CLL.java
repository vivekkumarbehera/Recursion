package DoubleLinkList.CirularLinkList;

public class CLL {
    private node head;
    private node tail;
    public CLL(){
        this.head=null;
        this.tail = null;
    }
    public void insert(int val){
        node node = new node(val);
        if(head == null){
            head= node;
            tail= node;
            return;
        }
        tail.next = node;
        node.next=head;
        tail=node;
    }
    public void display() {
        node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            } while (node != head);  // stop when we circle back to head
            System.out.println("HEAD");
        }
    }

    private class node{
         int val;
         node next;

         public node(int val, node next) {
             this.val = val;
             this.next = next;
         }

         public node(int val) {
             this.val = val;
         }
     }
}
