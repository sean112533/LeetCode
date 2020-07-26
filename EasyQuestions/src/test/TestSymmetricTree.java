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
    TreeNode root = new TreeNode();
    assertTrue("íf the TreeNode root is true value return true", test.isSymmetric(root) == true);
  }
}
