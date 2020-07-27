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
    int count;
    TreeNode root = new TreeNode();
    MaxBinary test = new MaxBinary();
    assertTrue("if the maxium depth of the tree node count is correct", test.maxDepth(root) == 3);
  }
}
