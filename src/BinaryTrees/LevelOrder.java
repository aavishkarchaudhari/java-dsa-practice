package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    static void levelOrder(Node root) {
//        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node front = q.remove();
            System.out.print(front.val + " ");

            if (front.left != null) q.add(front.left);
            if (front.right != null) q.add(front.right);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Build this tree:
        //        1
        //      /   \
        //     2     3
        //    / \   /
        //   4   5 6

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        levelOrder(root);
    }
}
