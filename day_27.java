class Solution {
  // Function to merge the arrays.
  public void mergeArrays(int a[], int b[]) {
    // code here
    int i = a.length - 1, j = 0;
    while (i >= 0 && j < b.length) {
      if (b[j] < a[i]) {
        int temp = a[i];
        a[i] = b[j];
        b[j] = temp;
      }
      i--;
      j++;
    }
    Arrays.sort(b);
    Arrays.sort(a);
  }
}