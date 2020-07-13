package code;

public class MaxSubArray {
  /**
   * return the largest sum of the number
   * 
   * @param nums arrays of integers.
   * @return sum it's largest number in arrays of integers.
   */
  public int maxSubArray(int[] nums) {
    int n = nums.length;
    int[] output = new int[n];
    int max = nums[0];
    output[0] = nums[0];

    for (int i = 1; i < n; i++) {
      output[i] = Math.max(nums[i], nums[i] + output[i - 1]);
      max = Math.max(max, output[i]);
    }
    return max;
  }

  /**
   * main method to run the corresponding method maxSubArray.
   * 
   * @param args
   */
  public static void main(String[] args) {
    MaxSubArray test = new MaxSubArray();
    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int result = test.maxSubArray(nums);
    System.out.println(result);
  }
}
