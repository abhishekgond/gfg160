class Solution {

  // a: input array
  // n: size of array
  // Function to find maximum circular subarray sum.
  public int circularSubarraySum(int arr[]) {

    // Your code here
    int minSum = Integer.MAX_VALUE;
    int maxSum = Integer.MIN_VALUE;
    int s1 = 0, s2 = 0, totalSum = 0;
    for (int i = 0; i < arr.length; i++) {
      totalSum += arr[i];
      s1 += arr[i];
      s2 += arr[i];
      if (s1 < 0)
        s1 = 0;
      if (s2 > 0)
        s2 = 0;
      maxSum = Math.max(maxSum, s1);
      minSum = Math.min(minSum, s2);
    }
    return Math.max(maxSum, (totalSum - minSum));

  }
}