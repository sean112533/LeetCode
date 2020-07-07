package code;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific
 * target. assume that each input would have exactly one solution, and you may not use the same
 * element twice.
 * 
 * @author sanghunlee
 *
 */
public class TwoSum {

  public int[] twoSum(int[] nums, int target) throws Exception {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] == target - nums[i]) {
          return new int[] {i, j};
        }
      }
    }
    throw new Exception("No tow sum solution");
  }

  public static void main(String[] args) throws Exception {
    TwoSum test = new TwoSum();
    int[] nums = {2, 7, 11, 15};
    int target = 9;

    System.out.println(test.twoSum(nums, target));

  }
}

