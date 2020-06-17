package code;

public class Palindrome {
  /**
   * method return boolean value when integer reads the same backwards as forwards.
   * 
   * @return boolean value.
   */
  public Boolean IsPalindrome(int num) {
    if (num < 0)
      return false;// if the number is less than 0 return the false;
    int reverse = 0;
    int remainder, originial = num;
    while (num != 0) {
      remainder = num % 10;
      reverse = reverse * 10 + remainder;
      num /= 10;
    }

    return originial == reverse;
  }

  /**
   * main method to run the IsPalindrome() mehtod.
   * 
   * @param args
   */

  public static void main(String[] args) {
    int number = 121;
    Palindrome test = new Palindrome();
    test.IsPalindrome(number);
    System.out.println(test.IsPalindrome(number));
  }

}
