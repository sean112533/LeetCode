package code;

/**
 * LeetCode easy questions 104. Maximum depth of the binary tree.
 * 
 * @author sanghunlee
 *
 */
public class MaxBinary {
  public int max; // depth of the int max of the tree.

  /**
   * maxDepth method to count the height of the treeNode from root of the tree to end of the
   * treeNode.
   * 
   * @param root
   * @return max number of the height of the treeNode.
   */
  public int maxDepth(TreeNode root) {
    traversal(root, 0);
    return max;
  }

  /**
   * using the recursion count the height of the each treeNode of left and right TreeNodes. search
   * the depth of the each left and right node by count.
   * 
   * @param node Node of the left and right node.
   * @param count the height of the each side of TreeNode.
   */
  public void traversal(TreeNode node, int count) {
    if (node == null) {
      if (count > max)
        max = count;
      count = 0;
      return;
    }
    ++count;
    traversal(node.left, count);
    traversal(node.right, count);
  }

  public static void main(String[] args) {
    MaxBinary test = new MaxBinary();
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    System.out.println(test.maxDepth(root));
  }

}
