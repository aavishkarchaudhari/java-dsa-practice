package HashTables;

import java.util.LinkedList;

public class HashMap_Implementation {
    static class MyHashMap<K, V> {
        public static final int Default_Capacity = 4;
        public static final float Default_Load_Factor = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private LinkedList<Node>[] buckets;

        public MyHashMap() {
            initBuckets(Default_Capacity);
        }

        private void initBuckets(int N) {
            buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunc(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        private int searchBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        public int size() {
            return n;
        }

        public void put(K key, V value) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchBucket(currBucket, key);

            if (ei == -1) {
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            } else {
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }
        }

        public V get(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchBucket(currBucket, key);

            if (ei != -1) {
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            return null;
        }

        public V remove(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchBucket(currBucket, key);

            if (ei != -1) {
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("India", 140);
        map.put("China", 150);
        map.put("US", 35);
        map.put("Nepal", 3);

        System.out.println("Initial size: " + map.size());
        System.out.println("India -> " + map.get("India"));
        System.out.println("China -> " + map.get("China"));
        System.out.println("US -> " + map.get("US"));
        System.out.println("Nepal -> " + map.get("Nepal"));
        System.out.println("Pakistan -> " + map.get("Pakistan")); // should be null

        map.put("India", 141);
        System.out.println("Updated India -> " + map.get("India"));

        System.out.println("Removed US -> " + map.remove("US"));
        System.out.println("Size after removal: " + map.size());
        System.out.println("Get US -> " + map.get("US"));
    }
}
