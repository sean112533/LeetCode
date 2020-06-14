package test;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import code.ReverseInteger;

/**
 * test class to run the TDD of class ReverserIntegerTest.java
 * 
 * @author sanghunlee
 *
 */
public class ReverseIntegerTest {
  ReverseInteger num = new ReverseInteger();

  @Test
  public void testReverse() {
    int number = 123;
    assertTrue("if the test return the 0 then it's true", num.reverseInt(number) == 321);
  }

}
