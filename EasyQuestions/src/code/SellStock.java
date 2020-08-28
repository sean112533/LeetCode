package code;

public class SellStock {

  public int maxProfit(int[] prices) {
    int maxProf = 0, j = 0;
    for (int i = 1; i < prices.length; i++) {
      int compare = prices[i] - prices[j];
      if (compare > maxProf) {
        maxProf = compare;
      }
      if (prices[i] < prices[j])
        j = i;
    }
    return maxProf;
  }

  public static void main(String[] args) {
    SellStock test = new SellStock();
    int[] prices = {7, 1, 5, 3, 6, 4};
    System.out.println(test.maxProfit(prices));
  }

}


