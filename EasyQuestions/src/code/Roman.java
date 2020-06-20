package code;

/**
 * Roman class to represent numerals to seven different symbols.
 * 
 * @author sanghunlee
 *
 */
public class Roman {

  public int romanToInt(String s) {
    if (s == null) {
      return 0;
    }
    int length = s.length();
    int sum = 0;
    int pre = 0;
    for (int i = length - 1; i >= 0; i--) {
      int cur = romanTable(s.charAt(i));

      if (i == length - 1) {
        sum = sum + cur;
      } else {
        if (cur < pre) {
          sum = sum - cur;
        } else {
          sum = sum + cur;
        }
      }
      pre = cur;
    }
    return sum;
  }

  public int romanTable(char c) {
    int number = 0;
    switch (c) {
      case 'I':
        number = 1;
        break;
      case 'V':
        number = 5;
        break;
      case 'X':
        number = 10;
        break;
      case 'L':
        number = 50;
        break;
      case 'C':
        number = 100;
        break;
      case 'D':
        number = 500;
        break;
      case 'M':
        number = 1000;
        break;
      default:
        number = 0;
        break;
    }
    return number;
  }

  public static void main(String[] args) {
    Roman test = new Roman();
    System.out.println(test.romanToInt("IX"));
  }

}
