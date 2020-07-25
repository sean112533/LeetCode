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

    TreeNode p = new TreeNode(1);
    p.left = new TreeNode(2);
    p.right = new TreeNode(3);


    TreeNode q = new TreeNode(1);
    q.left = new TreeNode(2);
    q.right = new TreeNode(3);

    System.out.println(p.val);
    System.out.println(p.left.val);
    System.out.println(p.right.val);

    System.out.println(q.val);
    System.out.println(q.left.val);
    System.out.println(q.right.val);

    System.out.println(test.isSameTree(p, q));
  }

}
