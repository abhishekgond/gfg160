class Solution {
  // Function to search a given number in row-column sorted matrix.
  public boolean searchMatrix(int[][] mat, int x) {
    // code here
    int n = mat.length, m = mat[0].length, mid = 0;
    int lo = 0, hi = (n * m) - 1;
    while (lo <= hi) {
      mid = lo + (hi - lo) / 2;
      int ro = mid / m;
      int col = mid % m;
      if (mat[ro][col] == x) {
        return true;
      } else if (mat[ro][col] > x) {
        hi = mid - 1;
      } else {
        lo = mid + 1;
      }
    }
    return false;
  }
}