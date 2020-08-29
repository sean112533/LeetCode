package code;

public class BestTimeToSell {
  /**
   * Method to find the Maximum profit with two most transaction.
   * 
   * @param prices
   * @return
   */
  public int maxProfit(int[] prices) {
    int len = prices.length;
    if (len <= 1)
      return 0;
    int a, b, c, d;
    d = Math.max(prices[len - 1], prices[len - 2]);
    c = Math.max(prices[len - 1] - prices[len - 2], 0);
    b = d;
    a = c;
    for (int i = len - 3; i >= 0; i--) {
      a = Math.max(b - prices[i], a);
      b = Math.max(prices[i] + c, b);
      c = Math.max(d - prices[i], c);
      d = Math.max(prices[i], d);
    }
    return a;
  }

  /**
   * Main method to run the algorithm method above.
   * 
   * @param args
   */

  public static void main(String[] args) {
    BestTimeToSell test = new BestTimeToSell();
    int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
    System.out.println(test.maxProfit(prices));
  }

}
