package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.Parentheses;

public class TestParentheses {
  @Before
  public void testParentheses() {
    Parentheses test = new Parentheses();
  }

  @Test
  public void testIsValid() {
    Parentheses test = new Parentheses();
    assertTrue("if the boolean value is true", test.isValid(" ") == false);
  }
}
