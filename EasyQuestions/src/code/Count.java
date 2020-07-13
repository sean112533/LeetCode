package code;

public class Count {
  /**
   * generate nth term of the count and say sequences. you can do it recursively, previous member
   * read off the digits, read & count the number of digits in groups of same digits.
   * 
   * @param n
   * @return
   */
  public String countAndSay(int n) {
    String s = "1";
    for (int outer = 1; outer < n; outer++) {
      String previous = s;
      s = "";
      int count = 1;
      char say = previous.charAt(0);

      for (int i = 1; i < previous.length(); i++) {
        if (previous.charAt(i) != say) {
          s = s + count + say;
          count = 1;
          say = previous.charAt(i);

        } else
          count++;
      }
      s = s + count + say;
    }
    return s;

  }

  public static void main(String[] args) {
    Count test = new Count();
    test.countAndSay(4);
    System.out.println(test.countAndSay(4));
  }

}
