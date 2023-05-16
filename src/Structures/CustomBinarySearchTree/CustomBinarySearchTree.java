package Structures.CustomBinarySearchTree;

public class CustomBinarySearchTree {
    Node root;


    public void insertLeaf(Node node, int leafValue) {
        if (root == null){
            Node root = new Node(leafValue);
            return;
        }
        if (node.value == leafValue) {
            return;
        }
        if (leafValue < node.value) {
            if (node.left != null) {
                insertLeaf(node.left, leafValue);
            } else {
                node.left = new Node(leafValue);
            }
        } else {
            if (node.right != null) {
                insertLeaf(node.right, leafValue);
            } else {
                node.right = new Node(leafValue);
            }
        }
    }


    public void deleteNode(int value) {
        if (root == null) {
            throw new IllegalArgumentException();
        }
        if (root.value == value){
            Node newRoot = root.right;
            root.right = root.right.right;
            root = newRoot;
            return;
        }
        if (value < root.value){
            if (root.left.value==value){

            }
        }
    }
    public void printTree (){

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
