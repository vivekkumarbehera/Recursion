package LinkList;

public class main {
    public static void main(String[] args) {
     Single_LinkList ll = new Single_LinkList();
     ReverseLinkListPt2 l2 = new ReverseLinkListPt2();ll.insertFirst(3);
    /* ll.insertFirst(8);
     ll.insertFirst(9);
     ll.insertFirst(10);
     ll.insertLast(12);
     ll.insert(33,3);
    ll.display(); */
        l2.insertFirst(2);
        l2.insertFirst(3);
        l2.insertFirst(4);
        l2.Rev();
    }
}
