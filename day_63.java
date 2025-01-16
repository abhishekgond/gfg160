class Solution {
  public int maxLen(int[] arr) {
    // Your code here
    HashMap<Integer, Integer> map = new HashMap<>();
    int ans = 0, sum = 0;
    map.put(0, -1);
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i] == 1 ? 1 : -1;
      if (map.containsKey(sum)) {
        ans = Math.max(ans, i - map.get(sum));
      } else {
        map.put(sum, i);
      }
    }
    return ans;

  }
}