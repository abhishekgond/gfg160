
// User function Template for Java

class Solution {
  void pushZerosToEnd(int[] arr) {
    // code here
    int x = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        arr[x++] = arr[i];
      }
    }
    for (int i = x; i < arr.length; i++) {
      arr[i] = 0;
    }
  }
}