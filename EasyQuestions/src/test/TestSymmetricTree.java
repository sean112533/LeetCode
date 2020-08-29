package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.SymmetricTree;
import code.TreeNode;

public class TestSymmetricTree {
  @Before
  public void testClass() {
    SymmetricTree test = new SymmetricTree();
  }

  @Test
  public void testIsSymmetric() {
    SymmetricTree test = new SymmetricTree();
    boolean result = false;
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(3);
    System.out.println(test.isSymmetric(root));
    assertTrue("íf the TreeNode root is true value return true", test.isSymmetric(root) == true);
  }
}
