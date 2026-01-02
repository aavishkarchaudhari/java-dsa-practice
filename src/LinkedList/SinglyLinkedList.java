package LinkedList;

public class SinglyLinkedList {

    public static class Node {
        int data; // value
        Node next; // address of next node

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            Node temp = head;
            int count = 0;

            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAt(int index, int val) {
            Node t = new Node(val);
            Node temp = head;

            if (index == size()) {
                insertAtEnd(val);
                return;
            } else if (index == 0) {
                insertAtHead(val);
                return;
            }

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            t.next = temp.next;
            temp.next = t;
        }

        int getAt(int index) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAt(int index) {
            if (index == 0) {
                head = head.next;
                return;
            }
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            tail = temp;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);

//        ll.display();

//        System.out.println("The length of the Linked List : " + ll.size());

        ll.insertAtHead(0);
        ll.display();

        ll.insertAt(4, 4);
        ll.display();

        ll.insertAt(0, -1);
        ll.display();

        System.out.println();

        System.out.println("Tail Data : " + ll.tail.data);
        System.out.println("Head Data : " + ll.head.data);

//        System.out.println(ll.getAt(5));

        ll.deleteAt(5);
        ll.display();
        System.out.println("Tail Data : " + ll.tail.data);

        System.out.println();

        ll.deleteAt(0);
        ll.display();
        System.out.println("Head Data : " + ll.head.data);
    }
}
