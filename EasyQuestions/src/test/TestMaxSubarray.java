package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.MaxSubArray;


public class TestMaxSubarray {
  /**
   * test before if it's the correct class exist.
   */
  @Before
  public void testClaas() {
    MaxSubArray test = new MaxSubArray();
  }

  /**
   * return the test value when the input is equal the expected output.
   */
  @Test
  public void testMaxSubArray() {
    MaxSubArray test = new MaxSubArray();
    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    assertTrue("givens integer array nums, find the contiguous subarray which has largest sum",
        test.maxSubArray(nums) == 6);
  }
}
