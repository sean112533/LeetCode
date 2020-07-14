package code;

/**
 * LeetCode easy questions 67.
 * 
 * @author sanghunlee
 *
 */
public class AddBinary {
  /**
   * AddBinary to read the two String values input to add up into the String result in binary adding
   * method.
   * 
   * @param a String of binary number.
   * @param b String of binary number.
   * @return added up binary number print out as String value.
   */
  public String addBinary(String a, String b) {
    int i = a.length() - 1;
    int j = b.length() - 1;
    char carry = '0';
    String result = "";

    while (i >= 0 && j >= 0) {
      if (a.charAt(i) == '1' && b.charAt(j) == '1') {
        result += carry == '1' ? '1' : '0';
        carry = '1';
      } else if (a.charAt(i) == '1' || b.charAt(j) == '1') {
        if (carry == '1') {
          result += '0';
          carry = '1';
        } else {
          result += '1';
        }
      } else {
        result += carry;
        carry = '0';
      }
      i--;
      j--;
    }
    while (i >= 0) {
      if (carry == '1' && a.charAt(i) == '1') {
        result += '0';
        carry = '1';
      } else {
        result += carry == '1' ? carry : a.charAt(i);
        carry = '0';
      }
      i--;
    }
    while (j >= 0) {
      if (carry == '1' && b.charAt(j) == '1') {
        result += carry == '1' ? carry : b.charAt(j);
        carry = '0';
      }
      j--;
    }
    if (carry == '1')
      result += '1';
    String str = "";
    for (int r = result.length() - 1; r >= 0; r--) {
      str += result.charAt(r);
    }
    return str;

  }

  /**
   * main method to test out the method is working.
   * 
   * @param args
   */
  public static void main(String[] args) {
    AddBinary test = new AddBinary();
    test.addBinary("11", "1");
  }
}
