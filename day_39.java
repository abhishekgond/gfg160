class Solution {
  // Function to search a given number in row-column sorted matrix.
  public boolean searchRowMatrix(int[][] mat, int x) {
    // code here
    for (int i = 0; i < mat.length; i++) {
      int lo = 0, hi = mat[0].length - 1, mid = 0;
      {
        while (lo <= hi) {
          mid = lo + (hi - lo) / 2;
          if (mat[i][mid] == x) {
            return true;
          } else if (mat[i][mid] > x) {
            hi = mid - 1;
          } else {
            lo = mid + 1;
          }
        }
      }
    }
    return false;
  }
}