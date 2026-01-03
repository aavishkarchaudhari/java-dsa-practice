package Stacks;

public class ArrayImplementationOfStacks {
    public static class Stack {
        private int[] arr = new int[5];
        private int index = 0;

        void push(int x) {
            arr[index] = x;
            index++;
        }

        int peek() {
            if (index == 0) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return arr[index - 1];
        }

        int pop() {
            if (index == 0) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int top = arr[index - 1];
            arr[index - 1] = 0;
            index--;
            return top;
        }

        void display() {
            for (int i = 0; i < index; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        int size() {
            return index;
        }

        boolean isEmpty() {
            if (index == 0) {
                return true;
            } else {
                return false;
            }
        }

        boolean isFull() {
            if (index == arr.length) {
                return true;
            } else {
                return false;
            }
        }

        int capacity(){
            return arr.length;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        st.display();

        System.out.println("\nSize of the Stack : " + st.size());

        st.pop();

        st.display();

        System.out.println("\n" + st.peek());
        st.push(4);
        st.push(5);

        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
    }
}
