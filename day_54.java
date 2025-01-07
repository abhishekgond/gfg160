class Solution {
  int countPairs(int arr[], int target) {
    int count = 0, i = 0, j = arr.length - 1;
    while (i < j) {
      int x = arr[i] + arr[j];
      if (x > target)
        j--;
      else if (x < target)
        i++;
      else {
        int e1 = arr[i], e2 = arr[j], c1 = 0, c2 = 0;
        while (i <= j && arr[i] == e1) {
          i++;
          c1++;
        }
        while (i <= j && arr[j] == e2) {
          j--;
          c2++;
        }
        if (e1 == e2) {
          count += c1 * (c1 - 1) / 2;
        } else {
          count += c1 * c2;
        }
      }
    }
    return count;
  }
}