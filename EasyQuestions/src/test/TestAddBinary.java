package test;

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
    String a;
    String b;
    assertTrue("if the addition of two binary number is correct", test.addBinary(a, b) == "100");
  }
}
