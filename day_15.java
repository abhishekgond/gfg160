class Solution {
  public String addBinary(String s1, String s2) {
    // code here
    StringBuilder sb = new StringBuilder();
    int i = s1.length() - 1;
    int j = s2.length() - 1;
    int carry = 0;
    while (i >= 0 || j >= 0 || carry > 0) {
      int x = (i >= 0) ? s1.charAt(i) - '0' : 0;
      int y = (j >= 0) ? s2.charAt(j) - '0' : 0;
      int sum = x + y + carry;
      sb.append(sum % 2);
      carry = sum / 2;
      i--;
      j--;
    }
    if (carry != 0) {
      sb.append(carry);
    }
    while (sb.length() >= 0 && sb.charAt(sb.length() - 1) == '0') {
      sb.setLength(sb.length() - 1);
    }
    return sb.reverse().toString();
  }
}