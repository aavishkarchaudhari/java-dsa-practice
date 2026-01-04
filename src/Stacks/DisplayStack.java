package Stacks;

import java.util.Stack;

public class DisplayStack {
    public static void displayRecursive(Stack<Integer> st) {
        if (st.size() == 0) {
            return;
        }
        int top = st.pop();
        displayRecursive(st);
        System.out.print(top + " ");
        st.push(top);
    }
    public static void displayReverse(Stack<Integer> st) {
        if (st.size() == 0) {
            return;
        }
        int top = st.pop();
        System.out.print(top + " ");
        displayRecursive(st);
        st.push(top);
    }



    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        displayReverse(st);
        System.out.println();
        displayRecursive(st);
        System.out.println();
        System.out.println(st);


    }
}
