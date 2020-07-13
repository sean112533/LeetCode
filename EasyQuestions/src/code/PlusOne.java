package code;

public class PlusOne {

  public int[] plusOne(int[] digits) {
    return helper(digits, digits.length - 1);
  }

  public int[] helper(int[] digits, int index) {
    if (digits[index] < 9) {
      digits[index]++;
      return digits;
    } else if (index != 0) {
      digits[index] = 0;
      return helper(digits, index - 1);
    } else {
      int[] res = new int[digits.length + 1];
      res[0] = 1;
      return res;
    }
  }

  public static void main(String[] args) {
    int[] input = {1, 2, 3};
    PlusOne test = new PlusOne();
    int[] target = test.plusOne(input);
    for (int element : target) {
      System.out.println(element);
    }
  }

}
