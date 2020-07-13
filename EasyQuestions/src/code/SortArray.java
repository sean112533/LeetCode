package code;

public class SortArray {
  /**
   * method to remove the duplicated integer in the int array.
   * 
   * @param nums
   * @return the array of integer that already removed the duplicated numbers
   * 
   */
  public int removeDuplicates(int[] nums) {
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == nums[index]) {
        index++;
        nums[index] = nums[i];
      }
    }
    return index + 1;
  }

  public static void main(String[] args) {
    SortArray test = new SortArray();
    int[] nums = {1, 1, 2};
    test.removeDuplicates(nums);
  }
}
