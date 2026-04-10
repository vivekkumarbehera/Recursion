package LinkList;

public class AddTwoNumber {
    private node head;
    private node tail;
    private int size;
    public AddTwoNumber(){
        this.size = 0;
    }
    public void InsertValue(int val){
        node node = new node(val);
        node.next = node;
        node = head;
        if (tail == null){
            tail=head;
        }
        size += 1;
    }
    public void insertLast(int val){
        if(tail==null){
            InsertValue(val);
        }
        node node= new node(val);
        tail.next= node;
        tail= node;
        size ++;
    }

    public node addTwoNumbers(node l1, node l2) {
        node dummy = new node(0);
        node current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new node(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            current.next = new node(carry);
        }

        return dummy.next;
    }
    private class node {
        public int val;
        private node next;
        private int value;
        public node(int value) {
            this.value = value;
        }
        public node(int value, node next){
            this.value= value;
            this.next=next;
        }
    }
}