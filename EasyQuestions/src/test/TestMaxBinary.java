package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.MaxBinary;
import code.TreeNode;

public class TestMaxBinary {
  @Before
  public void testClass() {
    MaxBinary test = new MaxBinary();
  }

  @Test
  public void testMaxDepth() {
    MaxBinary test = new MaxBinary();
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    assertTrue("if the maxium depth of the tree node count is correct", test.maxDepth(root) == 3);
  }
}
