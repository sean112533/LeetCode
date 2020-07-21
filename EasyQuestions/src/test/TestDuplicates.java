package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.Duplicates;
import code.ListNode;

public class TestDuplicates {

  @Before
  public void testClass() {
    Duplicates test = new Duplicates();
  }

  @Test
  public void testDeleteDuplicates() {
    Duplicates test = new Duplicates();
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    head.next.next = new ListNode(2);
    ListNode result = new ListNode(1);
    result.next = new ListNode(2);

    assertTrue("if the duplicated is delete in the linked list",
        test.deleteDuplicates(head).equals(result));

  }
}
