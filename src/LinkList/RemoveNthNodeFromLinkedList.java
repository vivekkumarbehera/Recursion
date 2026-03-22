package LinkList;

public class RemoveNthNodeFromLinkedList {
    private ListNode head;
    private ListNode tail;
    private int size;

    public RemoveNthNodeFromLinkedList() {
        this.size = 0;
    }

    public void InsertFirst(int value) {
        ListNode node = new ListNode(value);
        node.next = node;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void InsertLast(int value) {
        if (tail == null) {
            InsertFirst(value);
            return;
        }
        ListNode node = new ListNode(value);
        tail.next = node;
        size++;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to simplify edge cases (like removing head)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        // Move first pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the nth node
        second.next = second.next.next;

        return dummy.next; // Return new head
    }

    private class ListNode{
        int value;
        ListNode next;
        public ListNode(int value,ListNode next){
             this.value = value ;
            this.next = next;

        }
        public ListNode(int value){
            this.value=value;
        }
    }
}

