class Solution {
  // Function to find a solved Sudoku.
  static boolean solve(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if (arr[i][j] == 0) {
          for (int k = 1; k <= 9; k++) {
            if (isValid(arr, i, j, k)) {
              arr[i][j] = k;
              if (solve(arr) == true) {
                return true;
              } else {
                arr[i][j] = 0;

              }
            }
          }
          return false;
        }
      }
    }
    return true;
  }

  static boolean isValid(int arr[][], int row, int col, int k) {
    for (int i = 0; i < 9; i++) {
      if (arr[i][col] == k)
        return false;
      if (arr[row][i] == k)
        return false;
      if (arr[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == k)
        return false;
    }
    return true;
  }

  static void solveSudoku(int[][] mat) {
    // code here
    solve(mat);

  }

}