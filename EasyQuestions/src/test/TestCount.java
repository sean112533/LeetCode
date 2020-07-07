package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.Count;

public class TestCount {
  @Before
  public void testClass() {
    Count test = new Count();
  }

  @Test
  public void testCountAndSay() {
    Count test = new Count();
    assertTrue("if the count of sequence is correct", test.countAndSay(4).equals("1211"));
  }
}
