package Structures.CustomBinarySearchTree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomBinarySearchTreeTest {
    @Test
    void checkRootValue() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15, "Bob");
        tree.insertLeaf(7, "Mark");
        tree.insertLeaf(20, "Joe");
        Assertions.assertEquals("Tree {  index : 15 index : 7 index : 20 }", tree.toString());
    }

    @Test
    void checkRootValueAfterDeleteWithTwoChildren() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15, "Bob");
        tree.insertLeaf(7, "Mark");
        tree.insertLeaf(20, "Joe");
        tree.deleteLeaf(15);
        Assertions.assertEquals("Tree {  index : 20 index : 7 }", tree.toString());
    }

    @Test
    void checkRootValueAfterDeleteWithLeftChild() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15, "Bob");
        tree.insertLeaf(7, "Mark");
        tree.insertLeaf(5, "Shad");
        tree.insertLeaf(10, "Dock");
        tree.deleteLeaf(15);
        Assertions.assertEquals("Tree {  index : 7 index : 5 index : 10 }", tree.toString());

    }

    @Test
    void checkNodeValueAfterDeleteWithNoChildren() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15, "Bob");
        tree.deleteLeaf(15);
        Assertions.assertEquals("Tree { null }", tree.toString());

    }

    @Test
    void checkNodeValueAfterDeleteWithRightLeftChild() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15, "A");
        tree.insertLeaf(7, "B");
        tree.insertLeaf(20, "C");
        tree.insertLeaf(17, "D");
        tree.insertLeaf(16, "E");
        tree.insertLeaf(5, "F");
        tree.insertLeaf(10, "G");
        tree.insertLeaf(13, "H");
        tree.insertLeaf(11, "I");
        tree.deleteLeaf(10);
        Assertions.assertEquals("Tree {  index : 15 index : 7 index : 5 index : 11 index : 13 index : 20 index : 17 index : 16 }", tree.toString());
    }


    @Test
    void deleteAbsentElementTest() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15, "Bob");
        tree.insertLeaf(7, "Mark");
        tree.insertLeaf(20, "Joe");
        tree.insertLeaf(17, "Tom");
        tree.insertLeaf(15, "Ryann");
        boolean actual = tree.deleteLeaf(16);
        Assertions.assertFalse(actual);

    }

    @Test
    void printTreeTest() {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        tree.insertLeaf(15, "Bob");
        tree.insertLeaf(7, "Mark");
        tree.insertLeaf(10, "ad");
        tree.insertLeaf(5, "shad");
        tree.insertLeaf(20, "Joe");
        tree.insertLeaf(17, "Tom");
        tree.insertLeaf(21, "Sha");
        tree.printTree();
    }
}
