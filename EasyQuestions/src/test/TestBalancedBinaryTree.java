package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.BalancedBinaryTree;
import code.TreeNode;

public class TestBalancedBinaryTree {
  @Before
  public void testClass() {
    BalancedBinaryTree test = new BalancedBinaryTree();
  }

  @Test
  public void testIsBalanced() {
    boolean check = false;
    TreeNode root = new TreeNode();
    BalancedBinaryTree test = new BalancedBinaryTree();
    assertTrue("if the given binarytree is balanced return true", test.isBalanced(root) == true);
  }
}
