package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.SellStock;

public class TestSellStock {
  /**
   * use the @Before to test whether the class does exist to run the test the method maxProfit.
   */
  @Before
  public void testClass() {
    SellStock test = new SellStock();
  }

  /**
   * Test case to set the integer of arrays prices with method maxProfit. return true if the result
   * and estimated number matches.
   */
  @Test
  public void testMaxprofit() {
    SellStock test = new SellStock();
    int[] prices = {7, 1, 5, 3, 6, 4};
    assertTrue("price of the day i in array is correct ", test.maxProfit(prices) == 5);
  }
}
