package Stacks;

public class LinkedListImplementationStacks {
    public static class Node { // user defined data type
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class LLStack { // user defined data structures
        private Node head = null;
        private int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return head.val;
        }

        void displayrec(Node h){
            if(h==null){
                return;
            }
            displayrec(h.next);
            System.out.print(h.val + " ");
        }

        void display(){
            displayrec(head);
            System.out.println();
        }

        void displayrev() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            return size;
        }

        boolean isEmpty() {
            if (size == 0) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        st.display();

        System.out.println("Size of the Stack : " + st.size());

        st.pop();
        System.out.println("Size of the Stack : " + st.size());
        st.display();

        System.out.println( st.peek());
        st.push(4);
        st.push(5);
        st.display();
        System.out.println("Size of the Stack : " + st.size());
    }
}
