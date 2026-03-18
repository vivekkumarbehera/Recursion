package LinkList;

public class LeetCode203 {
    private node head;
    private node tail;
    private int size;

    public void Reduce_size() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        node node = new node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;

    }

    public void Inserlast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        node node = new node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            Inserlast(val);
            return;
        }
        node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        node node = new node(val, temp.next);
        temp.next = node;
        size++;
    }
    public node removeElements(node head, int val) {
        node dummy = new node (0);
        dummy.next = head;
        node current = dummy;

        while (current.next != null){
            if(current.next.value==val){
                current.next = current.next.next;
                size --;
            }
            else{
                current=current.next;
            }
        }
        this.head = dummy.next;
        this.tail = this.head;
        while (this.tail != null && this.tail.next != null) {
            this.tail = this.tail.next;
        }

        return this.head;

    }





    private class node {
        private int value;
        private node next;

        public node(int value, node next) {
            this.value = value;
            this.next = next;
        }

        public node(int value) {
            this.value = value;
        }
    }
}