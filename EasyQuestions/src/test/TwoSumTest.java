package test;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import code.TwoSum;

public class TwoSumTest {
  TwoSum n = new TwoSum();

  @Test
  public void testtwoSum() {
    int[] number = {2, 7, 11, 15};
    try {
      assertTrue("if the sum of two numbers are equal to target", n.twoSum(number, 9).equals(9));
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
