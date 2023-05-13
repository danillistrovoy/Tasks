package Structures.CustomBinarySearchTree;

public class CustomBinarySearchTree {
    public void createNewNode(int number) {
        Node newNode = new Node(number,null,null);
        newNode.value = number;
        newNode.left = null;
        newNode.right = null;
    }

    public Node insert(Node node, int value) {
        if (node == null) {
            createNewNode(value);
        }
        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    public Node deleteNode(Node node, int value) {
        if (node == null) {
            return null;
        }
        if (value < node.value) {
            node.left = deleteNode(node.left, value);
        } else if (value > node.value) {
            node.right = deleteNode(node.right, value);
        }
        else {
            if (node.left == null || node.right == null) {
                Node temp = null;
                temp = node.left == null ? node.right : node.left;

            if (temp ==null){
                return null;
            } else {
                return node;
            }

            }
        }
        return node;
    }

    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
}
