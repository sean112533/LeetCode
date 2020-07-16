package code;

/**
 * LeetCode question 70 easy.
 * 
 * @author sanghunlee
 *
 */
public class ClimbingStair {
  /**
   * climbing a stair case, takes n steps to reach to the top.
   * 
   * @param x
   * @return
   */
  public int climbStairs(int x) {
    int a = 0;
    int b = 1;
    int temp = 0;
    for (int i = 0; i < x; i++) {
      temp = b;
      b = b + a;
      a = temp;
    }
    return (x > 0) ? b : 0;
  }

  public static void main(String[] args) {
    ClimbingStair test = new ClimbingStair();
    test.climbStairs(2);
    System.out.println(test.climbStairs(2));
  }
}
