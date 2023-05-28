package Structures.CustomBinarySearchTree;

public class CustomBinarySearchTree {
    private Node root;


    public void insertLeaf(int leafValue) {
        if (root == null) {
            this.root = new Node(leafValue);
            return;
        }
        insert(root, leafValue);
    }

    private void insert(Node node, int leafValue) {
        if (node.value == leafValue) {
            return;
        }
        if (leafValue < node.value) {
            if (node.left != null) {
                insert(node.left, leafValue);
            } else {
                node.left = new Node(leafValue);
            }
        } else {
            if (node.right != null) {
                insert(node.right, leafValue);
            } else {
                node.right = new Node(leafValue);
            }
        }
    }


    public boolean deleteLeaf(int value) {
        if (root == null) {
            return false;
        } else if (root.value == value) {
            root = getNodeForDelete(root);
            return true;
        } else {
            delete(root, value);
            return true;
        }
    }

    private boolean delete(Node node, int value) {
        if (value < node.value) {
            if (node.left == null) {
                return false;
            }
            if (value == node.left.value) {
                node.left = getNodeForDelete(node.left);
                return true;
            } else {
                return delete(node.left, value);
            }
        } else {
            if (node.right == null){
                return false;
            }
            if (value == node.right.value) {
                node.right = getNodeForDelete(node.right);
                return true;
            } else {
                return delete(node.right, value);
            }
        }
    }

    private Node getNodeForDelete(Node node) {
        if (node.left == null && node.right == null) {
            return null;
        }
        if (node.left != null && node.right == null) {
            return node.left;
        }
        if (node.right.left != null) {
            return node.right.left;
        }
        return node.right;
    }


    public void printTree() {

    }

    public int checkRootValue() {
        return root.value;
    }

    public Node checkRoot() {
        return root;
    }

    public int checkRootRightChildValue() {
        return root.right.value;
    }

    public int checkRootLeftChildValue() {
        return root.left.value;
    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

}
