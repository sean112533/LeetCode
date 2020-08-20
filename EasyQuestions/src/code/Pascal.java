package code;

import java.util.ArrayList;
import java.util.List;

public class Pascal {

  public List<List> generate(int numRows) {
    List<List> triangle = new ArrayList<>();

    if (numRows == 0) {
      return triangle;
    }
    List<Integer> f_list = new ArrayList<>();
    f_list.add(1);
    triangle.add(f_list);

    for (int i = 1; i < numRows; i++) {
      List<Integer> row = new ArrayList<>();
      List<Integer> prev = triangle.get(i - 1);
      row.add(1);
      for (int j = 1; j < i; j++) {
        int res = prev.get(j - 1) + prev.get(j);
        row.add(res);
      }
      row.add(1);
      triangle.add(row);
    }
    return triangle;
  }

  public static void main(String[] args) {

  }
}
