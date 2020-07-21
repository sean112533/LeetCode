
package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.Str;

public class TestStr {
  @Before
  public void testClass() {
    Str test = new Str();
  }

  @Test
  public void testStrStr() {
    Str test = new Str();
    String haystack = "hello";
    String needle = "11";
    assertTrue("if the correct number is string matches it's true",
        test.strStr(haystack, needle) == -1);
  }
}

