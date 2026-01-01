package LinkedList;

public class NewLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        // Insert at the end
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        // Insert at the beginning
        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        // Insert at a given index
        void insertAt(int index, int val) {
            if (index < 0 || index > size()) {
                System.out.println("Invalid index.");
                return;
            }

            if (index == 0) {
                insertAtHead(val);
                return;
            }

            if (index == size()) {
                insertAtEnd(val);
                return;
            }

            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
        }

        // Get value at given index
        int getAt(int index) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        // Delete node at given index
        void deleteAt(int index) {
            if (index < 0 || index >= size()) {
                System.out.println("Invalid index.");
                return;
            }

            if (index == 0) {
                head = head.next;
                if (head == null) tail = null; // list became empty
                return;
            }

            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            if (temp.next == tail) {
                temp.next = null;
                tail = temp;
            } else {
                temp.next = temp.next.next;
            }
        }

        // Display the list
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Size of the list
        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);

        ll.insertAtHead(0);
        ll.display(); // 0 1 2 3

        ll.insertAt(4, 4);
        ll.display(); // 0 1 2 3 4

        ll.insertAt(0, -1);
        ll.display(); // -1 0 1 2 3 4

        System.out.println();
        System.out.println("Tail Data : " + ll.tail.data);
        System.out.println("Head Data : " + ll.head.data);

        ll.deleteAt(5); // Delete last node
        ll.display(); // -1 0 1 2 3
        System.out.println("Tail Data : " + ll.tail.data); // 3

        System.out.println();
        ll.deleteAt(0); // Delete head
        ll.display(); // 0 1 2 3
        System.out.println("Head Data : " + ll.head.data); // 0
    }
}
