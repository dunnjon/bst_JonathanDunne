import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {

    BinarySearchTree bst = new BinarySearchTree();

    @BeforeEach
    void setup() {
        bst.insert(99);
        bst.insert(106);
        bst.insert(15);
        bst.insert(69);
        bst.insert(74);
        bst.insert(36);
    }

    @Test
    void testRootNodeRight() {
        Assertions.assertEquals(106, bst.root.getRight().key);
    }

    @Test
    void testRootNodeLeft() {
        Assertions.assertEquals(15, bst.root.getLeft().key);
    }

    @Test
    void testRootNodeExists() {
        Assertions.assertEquals(true, bst.search(15));
    }

    @Test
    void testRootNodeDoesNotExist() {
        Assertions.assertEquals(false, bst.search(38));
    }


}
