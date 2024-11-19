class Solution {
  public int getSecondLargest(int[] arr) {
    // Code Here
    int n = arr.length;
    Arrays.sort(arr);
    int max = arr[n - 1];
    for (int i = n - 1; i >= 0; i--) {
      if (arr[i] != max) {
        return arr[i];
      }
    }
    return -1;
  }
}