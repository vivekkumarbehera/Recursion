package LinkList;

import java.lang.classfile.components.ClassPrinter;
import java.util.List;

public class leetcode206 {
    public static void main(String[] args) {
        leetcode206.Rev_LinkList list = new leetcode206().new Rev_LinkList();

        // Insert elements
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);

        System.out.println("Original List:");
        printList(list.head);

        // Reverse the list
        list.head = list.reverse(list.head);

        System.out.println("Reversed List:");
        printList(list.head);
    }

    // Helper method to print the list
    public static void printList(leetcode206.Rev_LinkList.Listnode head) {
        leetcode206.Rev_LinkList.Listnode temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public class Rev_LinkList {
        private Listnode head;
        private Listnode tail;
        private int size;

        public Rev_LinkList() {
            this.size = 0;
        }

        public void insertFirst(int val) {
            Listnode node = new Listnode(val);
            node.next = head;
            head = node;
            if (tail == null) {
                tail = head;
            }
            size++;
        }

        public void insertLast(int val) {
            if (head == null) {
                insertFirst(val);
                return;
            }
            Listnode node = new Listnode(val);
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
                insertLast(val);
                return;
            }
            Listnode temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Listnode node = new Listnode(val, temp.next);
            temp.next = node;
            size++;
        }

        public Listnode reverse(Listnode head) {
            Listnode prev = null;
            Listnode current = head;
            while (current != null) {
                Listnode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
        }

        public class Listnode {
            private int value;
            private Listnode next;

            public Listnode(int value, Listnode next) {
                this.value = value;
                this.next = next;
            }

            public Listnode(int value) {
                this.value = value;
            }
        }
    }
}