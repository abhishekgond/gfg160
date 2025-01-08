class Solution {
  // Function to count the number of possible triangles.
  static int countTriangles(int arr[]) {
    // code here
    int count = 0;
    Arrays.sort(arr);
    for (int i = arr.length - 1; i >= 0; i--) {
      int st = 0, end = i - 1;
      while (st < end) {
        int x = arr[st] + arr[end];
        if (x > arr[i]) {
          count += end - st;
          end--;
        } else {
          st++;
        }
      }
    }
    return count;
  }
}