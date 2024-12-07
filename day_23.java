
// User function Template for Java

class Solution {
  // Function to count inversions in the array.
  static int mergeSort(int arr[], int l, int r) {
    if (l >= r) {
      return 0;
    }
    int mid = (l + r) / 2;
    int leftInverse = mergeSort(arr, l, mid);
    int rightInverse = mergeSort(arr, mid + 1, r);
    int m = merege(arr, l, mid, r);
    return leftInverse + rightInverse + m;
  }

  static int merege(int arr[], int l, int mid, int r) {
    int j = mid + 1;
    int cn = 0;
    for (int i = l; i <= mid; i++) {
      while (j <= r && arr[i] > arr[j]) {
        j++;
      }
      cn += j - (mid + 1);
    }
    Arrays.sort(arr, l, r + 1);
    return cn;
  }

  static int inversionCount(int arr[]) {
    // Your Code Here
    return mergeSort(arr, 0, arr.length - 1);
  }
}