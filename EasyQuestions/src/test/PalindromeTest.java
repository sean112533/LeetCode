package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.Palindrome;

public class PalindromeTest {

  @Before
  public void testClass() {
    Palindrome test = new Palindrome();
  }

  @Test
  public void testIsPalindrome() {
    int number = 121;
    Palindrome test = new Palindrome();
    assertTrue("Integer is palindrome when it reads the same backwards as forwards",
        test.IsPalindrome(number) == true);
  }


}
