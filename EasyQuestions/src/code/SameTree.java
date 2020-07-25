package code;

/**
 * LeetCode Easy question 100.Same Tree.
 * 
 * @author sanghunlee
 *
 */
public class SameTree {

  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null & q == null) {
      return true;
    }
    if (p == null || q == null) {
      return false;
    }
    boolean rr1 = isSameTree(p.left, q.left);
    boolean rr2 = isSameTree(p.left, q.right);
    if (rr1 == false || rr2 == false) {
      return false;
    }
    if (p.val != q.val) {
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    SameTree test = new SameTree();

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


    test.isSameTree(p, q);
  }

}
