package LinkedList;

public class Basicsll {

    public static class Node {
        int data; // value
        Node next; // address of next node

        Node(int data) {
            this.data = data;
        }
    }

    // Function for displaying the Linked List
    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Recursive Function for displaying the Linked List
    public static void displayr(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        displayr(head.next);
    }

    // Function to find the length of the Linked List
    public static int length(Node a) {
        int count = 0;
        while (a != null) {
            count++;
            a = a.next;
        }
        return count;
    }

    // Main function
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(6);
        Node d = new Node(3);
        Node e = new Node(20);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
        System.out.println();
        displayr(a);

        System.out.println();
        Node temp = a;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
        int len = length(a);
        System.out.println("Length of Linked List : " + len);
    }
}