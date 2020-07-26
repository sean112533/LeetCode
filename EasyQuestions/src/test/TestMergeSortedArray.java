package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.MergeSortedArray;

public class TestMergeSortedArray {
  @Before
  public void testClass() {
    MergeSortedArray test = new MergeSortedArray();
  }

  @Test
  public void testMerge() {
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int[] nums2 = {2, 5, 6};
    int m = 3;
    int n = 3;
    int[] output = {1, 2, 2, 3, 5, 6};
    MergeSortedArray test = new MergeSortedArray();
    assertTrue("if two given integer array merge as one sorted array",
        test.merge(nums1, m, nums2, n) == output);
  }
}
