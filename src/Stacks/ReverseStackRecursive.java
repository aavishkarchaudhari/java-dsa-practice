package Stacks;

import java.util.Stack;

public class ReverseStackRecursive {

    public static void pushBottom(Stack<Integer> st, int data) {
        if (st.size() == 0) {
            st.push(data);
            return;
        }
        int top = st.pop();
        pushBottom(st, data);
        st.push(top);
    }

    public static void reverse(Stack<Integer> st){
        if(st.size() == 1){
            return;
        }
        int top = st.pop();
        reverse(st);
        pushBottom(st,top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
