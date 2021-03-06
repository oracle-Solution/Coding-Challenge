/**
 * Created by Vohra Kunal K on 10/14/2018.
 */
class RootNode {
    int data;
    RootNode left, right;

    RootNode(int item) {
        data = item;
        left = right = null;
    }
}


class KunalTree {
    RootNode root;

    void printLeaves(RootNode node) {
        if (node != null) {
            //printLeaves(node.right);
            printLeaves(node.right);
            if (node.left == null && node.right == null)
                System.out.print(node.data + " ");
            printLeaves(node.left);
        }
    }

    void printBoundaryLeft(RootNode node) {
        if (node != null) {
            if (node.left != null) {
                System.out.print(node.data + " ");
                printBoundaryLeft(node.left);
            } else if (node.right != null) {
                System.out.print(node.data + " ");
                printBoundaryLeft(node.right);
            }
        }
    }

    void printBoundaryRight(RootNode node) {
        if (node != null) {
            if (node.right != null) {
                printBoundaryRight(node.right);
                System.out.print(node.data + " ");
            } else if (node.left != null) {
                printBoundaryRight(node.left);
                System.out.print(node.data + " ");
            }
        }
    }

    // Print here
    void printBoundary(RootNode node) {
        if (node != null) {


            printBoundaryRight(node.right);
            printLeaves(node.right);
            printLeaves(node.left);
            printBoundaryLeft(node.left);

            /*
            printBoundaryLeft(node.left);
            printLeaves(node.left);
            printLeaves(node.right);
            printBoundaryRight(node.right);
            */
        }
    }

    // Main From Here
    public static void main(String args[]) {
        KunalTree tree = new KunalTree();
        tree.root = new RootNode(1);
        tree.root.left = new RootNode(2);
        tree.root.left.left = new RootNode(3);
        tree.root.left.right = new RootNode(4);
        tree.root.left.right.left = new RootNode(5);
        tree.root.left.right.right = new RootNode(6);
        tree.root.right = new RootNode(7);
        tree.root.right.right = new RootNode(8);
        System.out.print(tree.root.data + " ");
        tree.printBoundary(tree.root);
    }
}


