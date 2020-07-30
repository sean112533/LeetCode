package test;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import code.BinaryTreeLevel;
import code.TreeNode;

public class TestBinaryTreeLevel {
  /**
   * check the corresponding class exist before run the test.
   */
  @Before
  public void testClass() {
    BinaryTreeLevel test = new BinaryTreeLevel();
  }

  /**
   * test to check the levelOrderBottom works
   * 
   */
  @Test
  public void testLevelOrderBottom() {
    BinaryTreeLevel test = new BinaryTreeLevel();
    List<Integer> list = new ArrayList();
    TreeNode root = new TreeNode();
    assertTrue("if the bottom up level order traversal o fit's node values",
        test.levelOrderBottom(root) == null);
  }
}
