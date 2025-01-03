class Solution {
  public long subarrayXor(int arr[], int k) {
    // code here
    long ans = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    int curXor = 0;
    for (int i : arr) {
      curXor = curXor ^ i;
      if (map.containsKey(curXor ^ k))
        ans += map.get(curXor ^ k);
      map.put(curXor, map.getOrDefault(curXor, 0) + 1);
    }
    return ans;
  }
}