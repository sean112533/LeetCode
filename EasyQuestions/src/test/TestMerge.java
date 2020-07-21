package test;

import static org.junit.Assert.assertTrue;
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
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(3);
    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);

    ListNode result = new ListNode(1);
    result.next = new ListNode(1);
    result.next.next = new ListNode(2);
    result.next.next.next = new ListNode(3);
    result.next.next.next.next = new ListNode(4);
    result.next.next.next.next.next = new ListNode(4);
    assertTrue("if the next list is sorted list then it's true",
        test.mergeTwoList(l1, l2) == result);
  }


}
