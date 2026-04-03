package BinaryTrees;

public class Implementation {

    // Inorder Traversal: Left -> Root -> Right
    static void display(Node root) {
        if (root == null) return;

        display(root.left);
        System.out.print(root.val + " ");
        display(root.right);
    }

    static int Levels(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(Levels(root.left), Levels(root.right));
    }

    static int size(Node root) {
        if (root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    static int sum(Node root) {
        if (root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    static int product(Node root) {
        if (root == null) return 1;
        return root.val * product(root.left) * product(root.right);
    }

    static int Max(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(Max(root.left), Max(root.right)));
    }

    public static void main(String[] args) {

        // Creating nodes
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Display tree
        display(root);
        System.out.println();
        System.out.println("Size of Tree: " + size(root));

        System.out.println();
        System.out.println("Sum of Tree: " + sum(root));

        System.out.println();
        System.out.println("Product of Tree: " + product(root));

        System.out.println();
        System.out.println("Maximum of Tree: " + Max(root));

        System.out.println();
        System.out.println("Height of Tree: " + Levels(root));
    }
}
