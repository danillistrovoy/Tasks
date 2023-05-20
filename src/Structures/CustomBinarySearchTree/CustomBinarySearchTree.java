package Structures.CustomBinarySearchTree;

public class CustomBinarySearchTree {
    Node root;


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


    public boolean deleteNode(int value) {
        if (root == null) {
            return false;
        }
        if (root.value == value) {
            if (root.left == null && root.right == null) {
                root = null;
            }
            if (root.right != null && root.left != null) {
                root = root.right;
            }
            if (root.left != null && root.right == null) {
                root = root.left;
            }
            if (root.right.right == null && root.right.left != null) {
                root = root.right.left;
            }
            if (root.left.right != null && root.right == null) {
                root = root.left.right;
            }
            delete(root, value);
        }
        return true;
    }

    private void delete(Node node, int value) {
        if (value < node.value) {
            if (value == node.left.value) {
                if (node.left.right == null && node.left.left == null) {
                    node.left = null;
                }
                if (node.left.right != null && node.left.right.left == null) {
                    node.left = node.left.right;
                }
                if (node.left.right.left != null && node.left.left != null) {
                    node.left = node.left.right.left;
                } else {
                    delete(node.left, value);
                }
            }
        } else {
            if (value == node.right.value) {
                if (node.right.right == null && node.right.left == null) {
                    node.right = null;
                }
                if (node.right.right != null && node.right.right.left == null) {
                    node.right = node.right.right;
                }
                if (node.right.right.left != null && node.right.left != null) {
                    node.right = node.right.right.left;
                }
            } else {
                delete(node.right, value);
            }
        }
    }


    public void printTree() {

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
