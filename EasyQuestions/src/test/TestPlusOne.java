package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.PlusOne;

public class TestPlusOne {
  @Before
  public void testClass() {
    PlusOne test = new PlusOne();
  }

  @Test
  public void testPlusOne() {
    PlusOne test = new PlusOne();
    int[] digits = {1, 2, 3};
    int[] target = test.plusOne(digits);

    assertTrue("if the output is correct", test.plusOne(digits).equals(target));
  }
}
