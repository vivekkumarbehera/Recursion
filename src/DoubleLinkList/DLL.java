package DoubleLinkList;

public class DLL {
    private Node head;

    // Insert at beginning
    public void insertNode(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    // Display forward
    public void Disp() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("End");
    }

    // Display reverse
    public void RevDisp() {
        Node node = head;
        Node last = null;

        // Traverse forward to reach last node
        while (node != null) {
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }

        System.out.println("Reverse Of number:");

        // Traverse backward using prev
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;   // ✅ Corrected
        }
        System.out.println("End");
    }

    // Complete Node class
    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}