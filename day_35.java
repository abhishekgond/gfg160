class Solution {
  public int kthMissing(int[] arr, int k) {
    // code here
    int count = 0;
    int lo = 0, hi = arr.length - 1, mid = 0;
    while (lo <= hi) {
      mid = lo + (hi - lo) / 2;
      if (arr[mid] - mid - 1 < k)
        lo = mid + 1;
      else
        hi = mid - 1;
    }
    return lo + k;
  }
}