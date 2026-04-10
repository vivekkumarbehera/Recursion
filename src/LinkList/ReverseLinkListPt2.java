package LinkList;

public class ReverseLinkListPt2 {
    private ListNode head;
    private ListNode tail;
    private int size;
    public ReverseLinkListPt2(){
        this.size =0 ;
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public void insertFirst(int value){
        ListNode node = new ListNode(value);
        node.next = head;
        node = head;
        if(tail == null){
            tail = head;
        }
        size +=1;
    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        ListNode node = new ListNode(val);
        tail.next=node;
        tail=node;
        size++;

    }











 private class ListNode{
     private int value;
     private  ListNode  next;

     public ListNode(int value) {
         this.value = value;
     }

     public ListNode(int value, ListNode next) {
         this.value = value;
         this.next = next;
     }
 }


}
