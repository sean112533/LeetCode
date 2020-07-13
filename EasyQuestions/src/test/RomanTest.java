package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.Roman;

public class RomanTest {
  /*
   * run the Test to confirm the class Roman exists.
   */
  @Before
  public void testRomanToInt() {
    Roman test = new Roman();
    assertTrue("if the correct shift happends from roman letter(String) to integer return true",
        test.romanToInt("X") == 10);
  }

  @Test
  public void testSolution() {
    Roman test = new Roman();
    assertTrue("if Romand numerals are represent by seven different symbols",
        test.romanToInt("s") == 0);
  }

  @Test
  public void testRomanTable() {
    Roman test = new Roman();
    assertTrue("if the switch statement works correctly it will return the correct value",
        test.romanTable('X') == 10);
    assertFalse("if the switch statement doesn't work correctly it will return the false",
        test.romanTable('M') == 40);
  }
}
