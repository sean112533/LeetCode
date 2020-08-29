package test;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import code.Pascal;

public class testPascal {
  @Before
  public void testClass() {
    Pascal test = new Pascal();
  }

  @Test
  public void testGenerate() {
    Pascal test = new Pascal();
    int numsRows = 5;
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    assertTrue(
        "Given a non-negative integer numRows,generates the first numRows of Pascal's triangle",
        test.generate(numsRows) == list);
  }
}
