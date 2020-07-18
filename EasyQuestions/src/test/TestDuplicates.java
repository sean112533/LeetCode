package test;

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
    ListNode head = new ListNode();
    Duplicates test = new Duplicates();
    assertTrue("if the duplicated is delete in the linked list", test.deleteDuplicates() == result);

  }
}
