package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.AddBinary;

public class TestAddBinary {
  /**
   * test the class exist before carry out the test.
   */
  @Before
  public void testClass() {
    AddBinary test = new AddBinary();
  }

  /**
   * first test to check the addBinary works.
   */
  @Test
  public void testAddBinary() {
    AddBinary test = new AddBinary();
    String a = "11";
    String b = "1";
    String result = "100";
    assertTrue("if the addition of two binary number is correct",
        test.addBinary(a, b).equals(result));
  }

  /**
   * additional test to carry out the AddBinary works.
   */
  @Test
  public void testAgain() {
    AddBinary test = new AddBinary();
    String c = "1010";
    String d = "1011";
    String result = "10101";
    assertTrue("if  the two binary number add up correctly return true",
        test.addBinary(c, d).equals(result));

  }

}
