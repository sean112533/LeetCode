package code;

/**
 * Leet code easy questions : 69.
 * 
 * @author sanghunlee
 *
 */
public class Sqrt {
  /**
   * this will square root the input value
   * 
   * @param x integer number input
   * @return return the square root of number.
   */
  public int mySqrt(int x) {
    if (x <= 1) {// if the x is positive number return the x.
      return x;
    }
    int left = 1, right = x;
    if (left < right) {
      int mid = left + (right - 1) / 2;
      if (mid <= x / mid) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    return left - 1;
  }

  public static void main(String[] args) {
    Sqrt test = new Sqrt();
    System.out.println(test.mySqrt(4));
  }

}
