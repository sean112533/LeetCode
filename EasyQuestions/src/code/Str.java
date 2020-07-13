
package code;

public class Str {
  /**
   * return the index of the first occurrence of needle in haystack, or -1 if needle is not part of
   * haystack.
   * 
   * @param haystack
   * @param needle
   * @return
   */
  public int strStr(String haystack, String needle) {
    int l1 = haystack.length();
    int l2 = needle.length();
    int i = 0;
    for (i = 0; i <= l1 - l2; i++) {
      if (haystack.substring(i, i + l2).equals(needle))
        return i;
    }
    return -1;
  }

  public static void main(String[] args) {
    Str test = new Str();
    String haystack = "hello";
    String needle = "11";
    test.strStr(haystack, needle);
    System.out.println(test.strStr(haystack, needle));
  }

}

