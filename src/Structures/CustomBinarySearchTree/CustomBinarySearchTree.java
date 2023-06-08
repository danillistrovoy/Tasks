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
            return delete(root, value);
        }
    }

    private boolean delete(Node node, int value) {
        if (value < node.value) {
            if (value != node.left.value) {
                return delete(node.left, value);
            }
            if (node.left.right == null && node.left.left == null) {
                node.left = null;
                return true;
            }
            if (node.left.right == null) {
                node.left = node.left.left;
                return true;
            }
            if (node.left.right.left != null) {
                Node right = node.left.right;
                node.left = node.left.right.left;
                node.left.right = right;
                return true;
            }
            node.left = node.left.right;
            return true;
        } else {
            if (value != node.right.value) {
                return delete(node.right, value);
            }
            if (node.right.right == null && node.right.left == null) {
                node.right = null;
                return true;
            }
            if (node.right.right != null && node.right.right.left == null) {
                node.right = node.right.right;
                return true;
            }
            if (node.right.right.left != null && node.right.left != null) {
                Node right = node.right.right;
                node.right = node.right.right.left;
                node.right.right = right;
                return true;
            }
            node.right = node.right.right;
            return true;
        }
    }

    private Node getNodeForDelete(Node node) {
        if (node.left == null && node.right == null) {
            return null;
        }
        if (node.left != null && node.right == null) {
            return node.left;
        }
        if (node.right.left != null && node.right.left.right == null) {
            node.right.left.right = node.right;
            return node.right.left;
        }
        if (node.right.left != null) {
            var rightChild = node.right.left.right;

            while (rightChild.right != null){
                rightChild = rightChild.right;
            }
            rightChild.right = node.right;
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
