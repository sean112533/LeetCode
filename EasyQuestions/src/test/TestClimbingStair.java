package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.ClimbingStair;

public class TestClimbingStair {
  /**
   * test the class ClimbingStar exist before testing other method.
   */
  @Before
  public void testclass() {
    ClimbingStair test = new ClimbingStair();
  }

  /**
   * Test the corresponding method is working.
   */
  @Test
  public void testClimbingStars() {
    ClimbingStair test = new ClimbingStair();
    int x = 2;
    int output = 2;
    assertTrue("if the steps to reach to the top correct return true",
        test.climbStairs(x) == output);
  }
}
