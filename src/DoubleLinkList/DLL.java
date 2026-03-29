package DoubleLinkList;

public class DLL {
   private Node head;
    public void insertNode(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node ;
    }
    public void Disp(){
        Node node = head ;
        while(node != null){
            System.out.print(node.value+" ->");
            node = node.next;
        }
        System.out.println("End");
    }
   private class Node{
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
