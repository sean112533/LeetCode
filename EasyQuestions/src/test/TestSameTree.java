package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.SameTree;
import code.TreeNode;

public class TestSameTree {

  @Before
  public void testClass() {
    SameTree test = new SameTree();
  }

  @Test
  public void testIsSameTree() {
    SameTree test = new SameTree();
    TreeNode p = new TreeNode(1);
    p.left = new TreeNode(2);
    p.right = new TreeNode(3);

    TreeNode q = new TreeNode(1);
    p.left = new TreeNode(2);
    p.right = new TreeNode(3);

    assertTrue("check the binary tree is same or not", test.isSameTree(p, q) == true);
  }

}
