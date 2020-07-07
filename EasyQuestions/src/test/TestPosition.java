package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.Position;

public class TestPosition {

  @Before
  public void testClass() {
    Position test = new Position();
  }

  @Test
  public void testSearchInsert() {
    Position test = new Position();
    int nums[] = {1, 3, 5, 6};
    int target = 5;
    assertTrue("if the targeted value in array is correct return correct number",
        test.searchInsert(nums, target) == 2);
  }
}
