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
    TreeNode p = new TreeNode();
    p.val = 1;
    p.left = new TreeNode();
    p.left.val = 2;
    p.right = new TreeNode();
    p.right.val = 3;

    TreeNode q = new TreeNode();
    q.val = 1;
    q.left = new TreeNode();
    q.left.val = 2;
    q.right = new TreeNode();
    q.right.val = 3;

    SameTree test1 = new SameTree();
    assertTrue("check the binary tree is same or not", test1.isSameTree(p, q) == true);
  }

}
