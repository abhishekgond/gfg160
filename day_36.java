class Solution {
  public List<Integer> spiralOrder(int[][] mat) {
    ArrayList<Integer> al = new ArrayList<>();
    int top = 0, bot = mat.length - 1, left = 0, right = mat[0].length - 1, dir = 0;
    while (top <= bot && left <= right) {
      if (dir == 0) {
        for (int i = left; i <= right; i++) {
          al.add(mat[top][i]);
        }
        top++;
      }

      if (dir == 1) {
        for (int i = top; i <= bot; i++) {
          al.add(mat[i][right]);
        }
        right--;
      }

      if (dir == 2) {
        for (int i = right; i >= left; i--) {
          al.add(mat[bot][i]);
        }
        bot--;
      }
      if (dir == 3) {
        for (int i = bot; i >= top; i--) {
          al.add(mat[i][left]);
        }
        left++;
      }
      dir++;
      if (dir == 4) {
        dir = 0;
      }
    }
    return al;
  }
}