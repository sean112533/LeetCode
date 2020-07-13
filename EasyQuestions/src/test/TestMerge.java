package test;

import org.junit.Before;
import org.junit.Test;
import code.ListNode;

public class TestMerge {
  /**
   * test for the corresponding class exists.
   */
  @Before
  public void testMerge() {
    ListNode test = new ListNode();
  }

  @Test
  public void testMergeTwoLists() {
    ListNode test = new ListNode();
    assertTrue("if the next list is sorted list then it's true", test.mergeTwoList() == null);
  }


}
