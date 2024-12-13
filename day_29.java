class Solution {
  public int findMin(int[] arr) {
    // complete the function here
    if (arr.length == 1)
      return arr[0];
    int lo = 0, hi = arr.length - 1, mid = 0;
    while (lo < hi) {
      mid = lo + (hi - lo) / 2;
      if (arr[mid] <= arr[hi]) {
        hi = mid;
      } else {
        lo = mid + 1;
      }
    }
    return arr[lo];
  }
}
