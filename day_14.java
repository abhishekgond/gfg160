class Solution {
  public int myAtoi(String s) {
    // Your code here
    if (s == null || s.length() == 0)
      return 0;
    int i = 0, sign = 1;
    long result = 0;
    while (i < s.length() && s.charAt(i) == ' ') {
      i++;
    }
    if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
      sign = (s.charAt(i) == '-') ? -1 : 1;
      i++;
    }
    while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
      result = result * 10 + (s.charAt(i) - '0');
      if (result * sign >= Integer.MAX_VALUE)
        return Integer.MAX_VALUE;
      if (result * sign <= Integer.MIN_VALUE)
        return Integer.MIN_VALUE;
      i++;
    }

    return (int) (result * sign);
  }
}