package code;

public class MaxBinary {
  public int max; // depth of the int max of the tree.

  public int maxDepth(TreeNode root) {
    traversal(root, 0);
    return max;
  }

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
