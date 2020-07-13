package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import code.LastWord;

public class TestLastWord {
  @Before
  public void testClass() {
    LastWord test = new LastWord();
  }

  @Test
  public void testLengthOfLastWord() {
    LastWord test = new LastWord();
    assertTrue("count output of last word string value", test.lengthOfLastWord("Hello World") == 5);
  }
}
