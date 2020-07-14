package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.AddBinary;

public class TestAddBinary {
  @Before
  public void testClass() {
    AddBinary test = new AddBinary();
  }

  @Test
  public void testAddBinary() {
    AddBinary test = new AddBinary();
    String a = "11";
    String b = "1";
    String result = "100";
    assertTrue("if the addition of two binary number is correct",
        test.addBinary(a, b).equals(result));
  }

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
