package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.BestTime;

public class TestBestTime {
  /**
   * test class to check the BestTime.java exist.
   */
  @Before
  public void testClass() {
    BestTime test = new BestTime();
  }

  /**
   * test class to check the estimated number is matching with the actual result.
   */
  @Test
  public void testMaxProfit() {
    BestTime test = new BestTime();
    int[] prices = {7, 1, 5, 3, 6, 4};
    assertTrue("find the maxinum profit ", test.maxProfit(prices) == 7);
  }
}
