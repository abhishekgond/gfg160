class Solution {
  // Function to find equilibrium point in the array.
  public static int findEquilibrium(int arr[]) {
    // code here
    int left[] = new int[arr.length];
    int right[] = new int[arr.length];
    left[0] = arr[0];
    right[arr.length - 1] = arr[arr.length - 1];
    for (int i = 1; i < arr.length; i++) {
      left[i] = left[i - 1] + arr[i];
    }
    for (int i = arr.length - 2; i >= 0; i--) {
      right[i] = right[i + 1] + arr[i];
    }
    for (int i = 0; i < arr.length; i++) {
      if (left[i] == right[i]) {
        return i;
      }
    }
    return -1;
  }
}