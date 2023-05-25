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
            deleteSelectedLeaf(root, value);
        } else {
            delete(root, value);
        }
        return false;
    }

    private boolean delete(Node node, int value) {
        if (value < node.value) {
            if (value == node.left.value) {
                deleteSelectedLeaf(node.left, value);
            } else {
                delete(node.left, value);
            }
        } else {
            if (value == node.right.value) {
                deleteSelectedLeaf(node.right, value);
            } else {
                delete(node.right, value);
            }
        }
        return false;
    }

    private void deleteSelectedLeaf(Node node, int value) {
        if (node.left == null && node.right == null) {
            node = null;
            return;
        }
        if (node.left != null) {
            node = node.left;
            return;
        }
        if (node.right != null) {
            node = node.right;
            return;
        }
        if (node.right.left != null) {
            node = node.right.left;
            return;
        } else {
            delete(node, value);
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
