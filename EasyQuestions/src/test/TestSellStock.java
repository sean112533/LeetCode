package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.SellStock;

public class TestSellStock {

  @Before
  public void testClass() {
    SellStock test = new SellStock();
  }

  @Test
  public void testMaxprofit() {
    SellStock test = new SellStock();
    int[] prices;
    int i;
    assertTrue("price of the day i in array is correct ", test.maxProfit(i) == 5);
  }
}
