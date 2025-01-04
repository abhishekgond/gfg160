class Solution {
  public int countTriplets(int[] arr, int target) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      int s = i + 1;
      int e = arr.length - 1;
      while (s < e) {
        int sum = arr[i] + arr[s] + arr[e];
        if (sum > target) {
          e--;
        } else if (sum < target)
          s++;
        else {
          count++;
          int temp = s + 1;
          while (temp < e && arr[temp] == arr[temp - 1]) {
            count++;
            temp++;
          }
          e--;
        }
      }
    }
    return count;
  }
}