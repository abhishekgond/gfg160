class Solution {
  int search(int[] arr, int key) {
    // Complete this function
    int lo = 0, hi = arr.length - 1, mid = 0;
    while (lo <= hi) {
      mid = lo + (hi - lo) / 2;
      if (arr[mid] == key) {
        return mid;
      } else if (arr[lo] <= arr[mid]) {
        if (arr[lo] <= key && key < arr[mid]) {
          hi = mid - 1;
        } else {
          lo = mid + 1;
        }

      } else {
        if (arr[mid] < key && key <= arr[hi]) {
          lo = mid + 1;
        } else {
          hi = mid - 1;
        }

      }

    }
    return -1;
  }
}