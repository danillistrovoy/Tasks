package Structures.CustomBinarySearchTree;

public class CustomBinarySearchTreeTest {
    public static void main(String[] args) {
        checkRootValue();
        checkRootValueAfterRootDeleteCaseOneTest();
        checkRootValueAfterRootDeleteCaseTwoTest();
        checkRootValueAfterRootDeleteCaseThreeTest();
        deleteAbsentElementTest();
    }

    static void checkRootValue() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15);
        tree.insertLeaf(7);
        tree.insertLeaf(20);
        if (tree.checkRootValue() == 15) {
            System.out.println("insertLeafTest is ok!");
        } else {
            System.out.println("checkRootValue is not ok!!!");
        }
    }

    static void checkRootValueAfterRootDeleteCaseOneTest() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15);
        tree.insertLeaf(7);
        tree.insertLeaf(20);
        tree.deleteLeaf(15);
        if (tree.checkRootValue() == 20) {
            System.out.println("checkRootValueAfterRootDeleteTest is ok!");
        } else {
            System.out.println("checkRootValueAfterRootDeleteTest is not ok!!!");
        }
    }

    static void checkRootValueAfterRootDeleteCaseTwoTest() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15);
        tree.insertLeaf(7);
        tree.deleteLeaf(15);
        if (tree.checkRootValue() == 7) {
            System.out.println("checkRootValueAfterRootDeleteCaseTwoTest is ok!");
        } else {
            System.out.println("checkRootValueAfterRootDeleteCaseTwoTest is not ok!!!");
        }
    }

    static void checkRootValueAfterRootDeleteCaseThreeTest() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15);
        tree.deleteLeaf(15);
        if (tree.checkRoot() == null) {
            System.out.println("checkRootValueAfterRootDeleteCaseThreeTest is ok!");
        } else {
            System.out.println("checkRootValueAfterRootDeleteCaseThreeTest is not ok!!!");
        }
    }

    static void checkRootValueAfterRootDeleteCaseFourTest() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15);
        tree.insertLeaf(7);
        tree.insertLeaf(20);
        tree.insertLeaf(17);
        tree.deleteLeaf(15);
        if (tree.checkRootValue() == 17 && tree.checkRootLeftChildValue() == 7 && tree.checkRootRightChildValue() == 20) {
            System.out.println("checkRootValueAfterRootDeleteCaseFourTest is ok!");
        } else {
            System.out.println("checkRootValueAfterRootDeleteCaseFourTest is not ok!!!");
        }
    }

    static void deleteAbsentElementTest() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        try {
            tree.insertLeaf(15);
            tree.insertLeaf(20);
            tree.insertLeaf(10);
            tree.insertLeaf(18);
            tree.insertLeaf(17);
            tree.deleteLeaf(16);
            System.out.println("deleteAbsentElementTest is ok!");
        } catch (NullPointerException e){
            System.out.println("deleteAbsentElementTest is not ok!");
        }
    }
}
