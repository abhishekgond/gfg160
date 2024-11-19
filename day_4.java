
// User function Template for Java

class Solution {
  // Function to rotate an array by d elements in counter-clockwise direction.
  static void reverse(int i, int j, int arr[]) {
    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }

  static void rotateArr(int arr[], int d) {
    int n = arr.length;
    d = d % n;
    reverse(0, d - 1, arr);
    reverse(d, arr.length - 1, arr);
    reverse(0, arr.length - 1, arr);
  }
}