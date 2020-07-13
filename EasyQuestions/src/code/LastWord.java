package code;

public class LastWord {

  public int lengthOfLastWord(String s) {
    String[] str = s.split(" ");// create the split of the string value by space.
    if (str.length == 0)
      return 0;
    else
      return str[str.length - 1].length();// return the item length at last index of array.
  }

  public static void main(String[] args) {
    LastWord test = new LastWord();
    test.lengthOfLastWord("Hello World");
    int n = test.lengthOfLastWord("Hello World");
    System.out.println(n);
  }
}
