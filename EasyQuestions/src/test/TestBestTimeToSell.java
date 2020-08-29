package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.BestTimeToSell;

public class TestBestTimeToSell {

  @Before
  public void testClass() {
    BestTimeToSell test = new BestTimeToSell();
  }

  @Test
  public void testMaxProfit() {
    BestTimeToSell test = new BestTimeToSell();
    int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
    assertTrue("find the maximum profit of most two transaction", test.maxProfit(prices) == 6);
  }
}
