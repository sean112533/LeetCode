package code;

public class Position {

  public int searchInsert(int[] nums, int target) {
    // loop using the for loop to scan through to find the correct length for targeted integer.
    int length = nums.length;
    int i = 0;
    int r = length - 1;
    int x = 0;
    while (i <= r) {
      x = (1 + r) / 2;
      if (nums[x] == target)
        return x;
      else if (nums[x] < target)
        i = x + 1;
      else
        r = x - 1;
    }
    if (target < nums[x])
      return x;
    else
      return x + 1;
  }

  public void toInt() {
    System.out.println();
  }

  public static void main(String[] args) {
    Position test = new Position();
    int[] nums = {1, 3, 5, 6};
    int target = 5;
    test.searchInsert(nums, target);
    System.out.println(test.searchInsert(nums, target));
  }
}
