package Heaps;

import java.util.PriorityQueue;

public class PriorityQueueCollection {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);

        System.out.println(pq.peek());

        System.out.println(pq.size());

        System.out.println(pq.remove());

        System.out.println(pq.peek());

        pq.add(6);
        pq.add(35);
        pq.add(28);
        pq.add(3);
        pq.add(22);

        System.out.println(pq);
    }
}
