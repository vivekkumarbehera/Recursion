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
    public void delete(int val) {
        if (head == null) {
            return; // empty list
        }

        // Case 1: deleting head
        if (head.val == val) {
            if (head == tail) {
                // only one node
                head = null;
                tail = null;
                return;
            }
            head = head.next;
            tail.next = head; // maintain circular link
            return;
        }

        // Case 2: deleting non-head node
        node current = head;
        node prev = null;
        do {
            prev = current;
            current = current.next;

            if (current.val == val) {
                prev.next = current.next;
                if (current == tail) {
                    tail = prev; // update tail if needed
                }
                return;
            }
        } while (current != head);
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
