class Solution {
  public int longestSubarray(int[] arr, int k) {
    // code here
    int ans = 0;
    int currSum = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);
    for (int i = 0; i < arr.length; i++) {
      currSum += arr[i];
      if (map.containsKey(currSum - k)) {
        ans = Math.max(ans, i - map.get(currSum - k));
      }
      map.putIfAbsent(currSum, i);
    }
    return ans;
  }
}