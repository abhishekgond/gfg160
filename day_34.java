static int countpage(int arr[], int page) {
  int student = 1, pageOfStudent = 0;
  for (int i = 0; i < arr.length; i++) {
    if (arr[i] + pageOfStudent <= page) {
      pageOfStudent += arr[i];

    } else {
      student++;
      pageOfStudent = arr[i];
    }
  }
  return student;
}

public static int findPages(int[] arr, int k) {
  // code here
  int n = arr.length;
  if (k > n)
    return -1;
  int hi = 0, lo = 0, mid = 0, count = 0;
  for (int i = 0; i < arr.length; i++) {
    lo = Math.max(lo, arr[i]);
    hi += arr[i];
  }
  while (lo <= hi) {
    mid = lo + (hi - mid) / 2;
    count = countpage(arr, mid);
    if (count > k) {
      lo = mid + 1;
    } else {
      hi = mid - 1;
    }
  }
  return lo;
}