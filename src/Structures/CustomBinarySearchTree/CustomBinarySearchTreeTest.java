package Structures.CustomBinarySearchTree;

public class CustomBinarySearchTreeTest {
    public static void main(String[] args) {
        checkRootValue();
        checkRootValueAfterDeleteWithTwoChildren();
        checkRootValueAfterDeleteWithLeftChild();
        checkNodeValueAfterDeleteWithNoChildren();
        checkNodeValueAfterDeleteWithRightLeftChild();

    }

    static void checkRootValue() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15, "Bob");
        tree.insertLeaf(7, "Mark");
        tree.insertLeaf(20, "Joe");
        if (tree.toString().equals("Tree {  index : 15 index : 7 index : 20 }")) {
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
        if (tree.toString().equals("Tree {  index : 20 index : 7 }")) {
            System.out.println("checkRootValueAfterDeleteWithTwoChildrenTest is ok!");
        } else {
            System.out.println("checkRootValueAfterDeleteWithTwoChildrenTest is not ok!!!");
        }
    }

    static void checkRootValueAfterDeleteWithLeftChild() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15, "Bob");
        tree.insertLeaf(7, "Mark");
        tree.insertLeaf(5,"Shad");
        tree.insertLeaf(10,"Dock");
        tree.deleteLeaf(15);
        if (tree.toString().equals("Tree {  index : 7 index : 5 index : 10 }")) {
            System.out.println("checkRootValueAfterDeleteWithLeftChildTest is ok!");
        } else {
            System.out.println("checkRootValueAfterDeleteWithLeftChildTest is not ok!!!");
        }
    }

    static void checkNodeValueAfterDeleteWithNoChildren() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15, "Bob");
        tree.deleteLeaf(15);
        if (tree.toString().equals("Tree { null }")) {
            System.out.println("checkRootValueAfterDeleteWithNoChildrenTest is ok!");
        } else {
            System.out.println("checkRootValueAfterDeleteWithNoChildrenTest is not ok!!!");
        }
    }




    static void checkNodeValueAfterDeleteWithRightLeftChild() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15, "A");
        tree.insertLeaf(7, "B");
        tree.insertLeaf(20, "C");
        tree.insertLeaf(17,"D");
        tree.insertLeaf(16,"E");
        tree.insertLeaf(5,"F");
        tree.insertLeaf(10,"G");
        tree.insertLeaf(13,"H");
        tree.insertLeaf(11,"I");
        tree.deleteLeaf(10);
        if (tree.toString().equals("Tree {  index : 15 index : 7 index : 5 index : 11 index : 13 index : 20 index : 17 index : 16 }")) {
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



    static void printTreeTest(){
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15, "Bob");
        tree.insertLeaf(7, "Mark");
        tree.insertLeaf(10,"ad");
        tree.insertLeaf(5, "shad");
        tree.insertLeaf(20, "Joe");
        tree.insertLeaf(17,"Tom");
        tree.insertLeaf(21,"Sha");
        tree.printTree();
    }
}
