package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.Sqrt;

/**
 * test class for Sqrt.java class.
 * 
 * @author sanghunlee
 *
 */
public class TestSqrt {
  /**
   * test the Sqrt.java exist before carry out the test.
   */
  @Before
  public void testClass() {
    Sqrt test = new Sqrt();
  }

  @Test
  public void testMySqrt() {
    Sqrt test = new Sqrt();
    int x = 4;
    int result = 2;
    assertTrue("if the return number is square root of the input number", test.mySqrt(x) == result);
  }


}
