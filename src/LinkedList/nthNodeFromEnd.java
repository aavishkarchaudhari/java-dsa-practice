package LinkedList;

public class nthNodeFromEnd {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // finding nth element from end of ll
    public static Node nthNode1(Node head, int n) {
        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        Node t = head;
        int m = size - n + 1;
        for (int i = 0; i < m - 1; i++) {
            t = t.next;
        }
        return t;
    }

    // finding nth element from end of ll
    public static Node nthNode2(Node head, int n) {
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    // removing nth node from end of ll
    public static Node removeFromEnd(Node head, int n) {
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < n; i++) {

            fast = fast.next;
        }

        if(fast == null){
            return head.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;


        Node temp1 = nthNode1(a, 2);
        System.out.println("Element : " + temp1.data);

        Node temp2 = nthNode2(a, 3);
        System.out.println("Element : " + temp2.data);

        removeFromEnd(a, 2);
        display(a);

         a = removeFromEnd(a, 4);
        display(a);
    }
}
