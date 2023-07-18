package Structures.CustomBinarySearchTree;

import java.util.*;

public class CustomBinarySearchTree {
    private Node root;


    public void insertLeaf(int leafIndex, String value) {
        if (root == null) {
            this.root = new Node(leafIndex, value);
            return;
        }
        insert(root, leafIndex, value);
    }

    private void insert(Node node, int leafIndex, String value) {
        if (node.index == leafIndex) {
            return;
        }
        if (leafIndex < node.index) {
            if (node.left != null) {
                insert(node.left, leafIndex, value);
            } else {
                node.left = new Node(leafIndex, value);
            }
        } else {
            if (node.right != null) {
                insert(node.right, leafIndex, value);
            } else {
                node.right = new Node(leafIndex, value);
            }
        }
    }


    public boolean deleteLeaf(int index) {
        if (root == null) {
            return false;
        } else if (root.index == index) {
            root = getNodeForDelete(root);
            return true;
        } else {
            return delete(root, index);
        }
    }

    private boolean delete(Node node, int index) {
        if (index < node.index) {
            if (node.left == null) {
                return false;
            }
            if (index == node.left.index) {
                node.left = getNodeForDelete(node.left);
                return true;
            } else {
                return delete(node.left, index);
            }
        } else {
            if (node.right == null) {
                return false;
            }
            if (index == node.right.index) {
                node.right = getNodeForDelete(node.right);
                return true;
            } else {
                return delete(node.right, index);
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
        Node nodeRightLeft = node.right.left;
        if (nodeRightLeft != null) {

            Node leftChild = nodeRightLeft;
            Node prev = node.right;

            if (leftChild.left != null) {
                while (leftChild.left != null) {
                    prev = leftChild;
                    leftChild = leftChild.left;
                }
            }
            prev.left = leftChild.right == null ? null : leftChild.right;

            leftChild.right = node.right;
            leftChild.left = node.left;

            return leftChild;
        }
        node.right.left = node.left;
        return node.right;
    }

    public void printTree() {
        Queue<Node> tree = new LinkedList<>();
        tree.add(this.root);
        while (!tree.isEmpty()) {
            Node node = tree.remove();
            System.out.println("\t\t\t\t" + node.index);
            if (node.left != null) {
                tree.add(node.left);
            }
            if (node.right != null) {
                tree.add(node.right);
            }
        }
    }


    public int checkRootIndex() {
        return root.index;
    }

    public Node checkRoot() {
        return root;
    }

    public int checkRootRightChildIndex() {
        return root.right.index;
    }

    public int checkRootLeftChildIndex() {
        return root.left.index;
    }


    private static class Node {
        int index;
        String value;
        Node left;
        Node right;


        public Node(int index, String value) {
            this.index = index;
            this.value = value;
        }
    }

}
