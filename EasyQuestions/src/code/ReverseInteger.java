package code;

public class ReverseInteger {
  // to make the reverse integer output from the input value.

  public int reverseInt(int x) {
    int rev = 0;
    while (x != 0) {
      int pop = x % 10;
      x /= 10;
      if (rev > Integer.MAX_VALUE || (rev == Integer.MAX_VALUE / 10 && pop > 7))
        return 0;
      if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
        return 0;
      rev = rev * 10 + pop;

    }
    return rev;
  }

  public static void main(String[] args) {
    int num = 123;
    ReverseInteger reverse = new ReverseInteger();
    reverse.reverseInt(num);
    System.out.println(reverse.reverseInt(num));

  }
}
