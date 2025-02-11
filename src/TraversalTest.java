import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TraversalTest {
    @Test
    public void testTreeNodeConstructorWithValue() {
        TreeNode node = new TreeNode(10);
        assertEquals(10, node.value);
        assertNull(node.left);
        assertNull(node.right);
    }

    @Test
    public void testTreeNodeConstructorWithValueAndChildren() {
        TreeNode leftChild = new TreeNode(5);
        TreeNode rightChild = new TreeNode(15);
        TreeNode node = new TreeNode(10, leftChild, rightChild);
        
        assertEquals(10, node.value);
        assertEquals(5, node.left.value);
        assertEquals(15, node.right.value);
    }
}