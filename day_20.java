class Solution {
  // Function to check if two strings are rotations of each other or not.
  public static boolean areRotations(String s1, String s2) {
    // Your code here
    StringBuilder sb = new StringBuilder(s2);
    sb.append('$').append(s1).append(s1);
    int n = sb.length(), i = 0, j = 1, m = s2.length();
    int arr[] = new int[n];
    Arrays.fill(arr, 0);
    String str = sb.toString();
    while (j < n) {
      if (str.charAt(i) == str.charAt(j)) {
        arr[j++] = ++i;
        if (i == m)
          return true;
      } else if (i != 0)
        i = arr[i - 1];
      else
        j++;
    }
    return false;
  }
}