class Solution {

  public int maxWater(int arr[]) {
    // Code Here
    int max = 0;
    int i = 0, j = arr.length - 1;
    while (i < j) {
      max = Math.max(max, Math.min(arr[i], arr[j]) * (j - i));
      if (arr[i] < arr[j]) {
        i++;
      } else {
        j--;
      }
    }
    return max;
  }
}