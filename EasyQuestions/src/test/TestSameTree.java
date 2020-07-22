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
    boolean test = false;
    TreeNode p = null;
    TreeNode q = null;
    SameTree test1 = new SameTree();
    assertTrue("check the binary tree is same or not", test1.isSameTree(p, q) == true);

  }
}
