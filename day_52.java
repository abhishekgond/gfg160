class Solution {
  int countPairs(int arr[], int target) {
    // Your code here
    int count = 0;
    int i = 0;
    int j = arr.length - 1;
    Arrays.sort(arr);
    while (i < j) {
      if ((arr[i] + arr[j]) < target) {
        count += j - i;
        i++;
      } else {
        j--;
      }
    }
    return count;
  }
}