package test;

import org.junit.Before;
import org.junit.Test;
import code.Prefix;

public class TestPrefix {
  /**
   * check the prefix class exists before the testing.
   */
  @Before
  public void testPrefix() {
    Prefix test = new Prefix();
  }

  @Test
  public void testLongestCommonPrefix() {
    Prefix test = new Prefix();
    assertTrue("if the method is correct it will return true", test.longestCommonPrefix() == null);
  }
}
