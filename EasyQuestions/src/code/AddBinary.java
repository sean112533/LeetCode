package code;

public class AddBinary {

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

  public static void main(String[] args) {
    AddBinary test = new AddBinary();
    test.addBinary("11", "1");
  }
}
