package test;

import org.junit.Test;
import code.TwoSum;

public class TwoSumTest {
  TwoSum n = new TwoSum();

  @Test
  public void testtwoSum() {
    TwoSum test = new TwoSum();
    int[] nums = {2, 7, 11, 15};
    int target = 9;

    assertTrue("ïf the value is equal each other it's true", test.twoSum(nums, target));

  }
}
