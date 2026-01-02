package LinkedList;

public class Doublyll {

    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    public static void display1(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayrev(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void display2(Node random) {
        Node temp = random;
        while (temp.prev != null) {
            temp = temp.prev;
        }

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node insertAtHead(Node head, int x) {
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }

    public static void insertAtTAil(Node head, int x) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
    }

    public static void insertAtIndex(Node head, int index, int x) {
        Node s = head;
        for (int i = 0; i < index - 1; i++) {
            s = s.next;
        }

        Node r = s.next;
        Node t = new Node(x);
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        display1(a);
        displayrev(e);

        display2(c);

        Node newHead = insertAtHead(a,35);
        display1(newHead);

        insertAtTAil(a, 90);
        display1(a);


        insertAtIndex(a,3,56);
        display1(a);

    }
}
