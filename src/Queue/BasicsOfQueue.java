package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class BasicsOfQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);

        System.out.println("Size : " + q.size());

        q.remove();
        System.out.println(q);

        q.poll();
        System.out.println(q);

        System.out.println(q.peek());
    }
}
