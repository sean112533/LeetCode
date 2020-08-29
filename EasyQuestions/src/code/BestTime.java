package code;

public class BestTime {
  /**
   * Q123. Algorithm to find the Maximum profit from multiple transaction.
   * 
   * @param prices integer of array.
   * @return the total maximum number of profit.
   */
  public int maxProfit(int[] prices) {
    if (prices.length == 0)
      return 0;
    int max = 0;

    for (int i = 0; i < prices.length - 1; i++) {
      if (prices[i] < prices[i + 1]) {
        max += prices[i + 1] - prices[i];
      }
    }
    return max;
  }

  public static void main(String[] args) {
    BestTime test = new BestTime();
    int[] prices = {7, 1, 5, 3, 6, 4};

    System.out.println(test.maxProfit(prices));
  }

}
