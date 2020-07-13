package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.SortArray;

public class TestSortArray {
  @Before
  public void testSortArray() {
    SortArray test = new SortArray();
  }

  @Test
  public void testRemoveDuplicates() {
    SortArray test = new SortArray();
    int[] nums = {1, 1, 2};
    assertTrue("if the sorted arry nums removed the duplicated number return true",
        test.removeDuplicates(nums) == 2);
  }


}
