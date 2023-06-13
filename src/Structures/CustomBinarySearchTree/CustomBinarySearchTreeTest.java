package Structures.CustomBinarySearchTree;

public class CustomBinarySearchTreeTest {
    public static void main(String[] args) {
        printTest();
    }

    static void checkRootValue() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15, "Bob");
        tree.insertLeaf(7, "Mark");
        tree.insertLeaf(20, "Joe");
        if (tree.checkRootIndex() == 15) {
            System.out.println("insertLeafTest is ok!");
        } else {
            System.out.println("checkRootValue is not ok!!!");
        }
    }

    static void checkRootValueAfterDeleteWithTwoChildren() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15, "Bob");
        tree.insertLeaf(7, "Mark");
        tree.insertLeaf(20, "Joe");
        tree.deleteLeaf(15);
        if (tree.checkRootIndex() == 20) {
            System.out.println("checkRootValueAfterDeleteWithTwoChildrenTest is ok!");
        } else {
            System.out.println("checkRootValueAfterDeleteWithTwoChildrenTest is not ok!!!");
        }
    }

    static void checkRootValueAfterDeleteWithLeftChild() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15, "Bob");
        tree.insertLeaf(7, "Mark");
        tree.deleteLeaf(15);
        if (tree.checkRootIndex() == 7) {
            System.out.println("checkRootValueAfterDeleteWithLeftChildTest is ok!");
        } else {
            System.out.println("checkRootValueAfterDeleteWithLeftChildTest is not ok!!!");
        }
    }

    static void checkRootValueAfterDeleteWithNoChildren() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15, "Bob");
        tree.deleteLeaf(15);
        if (tree.checkRoot() == null) {
            System.out.println("checkRootValueAfterDeleteWithNoChildrenTest is ok!");
        } else {
            System.out.println("checkRootValueAfterDeleteWithNoChildrenTest is not ok!!!");
        }
    }

    static void checkRootValueAfterDeleteWithRightLeftChild() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15, "Bob");
        tree.insertLeaf(7, "Mark");
        tree.insertLeaf(20, "Joe");
        tree.insertLeaf(17,"Tom");
        tree.insertLeaf(16,"Jay");
        tree.deleteLeaf(15);
        if (tree.checkRootIndex() == 17 && tree.checkRootLeftChildIndex() == 7 && tree.checkRootRightChildIndex() == 20) {
            System.out.println("checkRootValueAfterDeleteWithRightLeftChildTest is ok!");
        } else {
            System.out.println("checkRootValueAfterDeleteWithRightLeftChildTest is not ok!!!");
        }
    }

    static void deleteAbsentElementTest() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        try {
            tree.insertLeaf(15, "Bob");
            tree.insertLeaf(7, "Mark");
            tree.insertLeaf(20, "Joe");
            tree.insertLeaf(17,"Tom");
            tree.insertLeaf(15,"Ryann");
            tree.deleteLeaf(16);
            System.out.println("deleteAbsentElementTest is ok!");
        } catch (NullPointerException e) {
            System.out.println("deleteAbsentElementTest is not ok!");
        }
    }
}
