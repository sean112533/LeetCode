package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.ConvertSortedArray;
import code.TreeNode;

public class TestConvertSortedArray {
  @Before
  public void testClass() {
    ConvertSortedArray test = new ConvertSortedArray();
  }

  @Test
  public void testSortedArrayToBST() {
    ConvertSortedArray test = new ConvertSortedArray();
    TreeNode root = new TreeNode();
    int[] nums;
    assertTrue("if the sorted elements in ascedning order", test.sortedArrayToBST(nums) == null);

  }
}
