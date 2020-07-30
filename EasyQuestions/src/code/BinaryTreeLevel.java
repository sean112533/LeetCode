package code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevel {

  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> list = new LinkedList<>();
    levelOrderBottom(root, list, 0);
    return list;
  }

  public void levelOrderBottom(TreeNode root, List<List<Integer>> list, int level) {
    if (root != null) {
      if (level == list.size())
        ((LinkedList) list).addFirst(new ArrayList<>());
      list.get(list.size() - level - 1).add(root.val);
      levelOrderBottom(root.left, list, level + 1);
      levelOrderBottom(root.right, list, level + 1);
    }
  }

  public static void main(String[] args) {

  }

}
