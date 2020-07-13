package code;

public class Element {
  /**
   * array nus and a value val, remove all instances that value in place and return the new length.
   * 
   * @param nums
   * @param val
   * @return then length of the value.
   */
  public int removeElement(int[] nums, int val) {
    int len = nums.length;
    for (int i = 0; i < len;) {
      if (nums[i] == val) {
        for (int j = i; j < len; i++) {
          if (j == len - 1)
            nums[j] = 0;
          else
            nums[j] = nums[j + 1];
        }
        len--;
      } else
        len++;
    }
    return len;
  }

  public static void main(String[] args) {
    Element test = new Element();
    int nums[] = {3, 2, 2, 3};
    int val = 3;
    test.removeElement(nums, val);
  }

}
