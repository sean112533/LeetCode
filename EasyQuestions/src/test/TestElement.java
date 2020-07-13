package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.Element;

public class TestElement {
  @Before
  public void testClass() {
    Element test = new Element();

  }

  @Test
  public void testRemoveElement() {
    Element test = new Element();
    int nums[] = {3, 2, 2, 3};
    int val = 3;
    assertTrue("if the remove element is correct return true", test.removeElement(nums, val) == 2);
  }
}
