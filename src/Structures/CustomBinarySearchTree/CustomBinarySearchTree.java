package Structures.CustomBinarySearchTree;

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
        if (node.right.left != null && node.right.left.right == null) {
            node.right.left.right = node.right;
            return node.right.left;
        }
        if (node.right.left != null) {
            var rightChild = node.right.left.right;

            while (rightChild.right != null) {
                rightChild = rightChild.right;
            }
            rightChild.right = node.right;
            return node.right.left;
        }
        return node.right;
    }

    public void printTree() {

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

    /*      public int RecursiveTreePass(Node node) {
            int sum = index;
            if (left != null) {
                sum += left.index;
                left.RecursiveTreePass(left);
            }
            if (right != null){
                sum += right.index;
                right.RecursiveTreePass(right);
            }
            return sum;
        }

     */

        public Node(int index, String value) {
            this.index = index;
            this.value = value;
        }
    }

}
