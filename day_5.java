// User function Template for Java

class Solution {
  static void reverse(int arr[], int i, int j) {
    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }

  void nextPermutation(int[] arr) {
    // code here
    int first = -1;
    for (int i = arr.length - 2; i >= 0; i--) {
      if (arr[i] < arr[i + 1]) {
        first = i;
        break;
      }
    }
    if (first == -1) {
      reverse(arr, 0, arr.length - 1);
      return;
    }
    for (int i = arr.length - 1; i > first; i--) {
      if (arr[i] > arr[first]) {
        int temp = arr[i];
        arr[i] = arr[first];
        arr[first] = temp;
        break;
      }
    }
    reverse(arr, first + 1, arr.length - 1);
    return;
  }
}