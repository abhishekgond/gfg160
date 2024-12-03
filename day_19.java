class Solution {
  static int lps(String s) {
    int[] lps = new int[s.length()];
    int size = s.length(), len = 0, i = 1;
    while (i < size) {
      if (s.charAt(i) == s.charAt(len)) {
        len++;
        lps[i] = len;
        i++;
      } else {
        if (len != 0) {
          len = lps[len - 1];
        } else {
          len = 0;
          lps[i] = 0;
          i++;
        }
      }
    }
    return len;
  }

  public static int minChar(String s) {
    // Write your code here
    String rev = new StringBuilder(s).reverse().toString();
    String newString = s + "&" + rev;
    int len = lps(newString);
    return s.length() - len;
  }
}