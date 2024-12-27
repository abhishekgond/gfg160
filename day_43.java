class Solution {
  int countPairs(int arr[], int target) {
    // Your code here
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i : arr) {
      if (map.containsKey(target - i)) {
        count += map.get(target - i);
      }
      map.put(i, map.getOrDefault(i, 0) + 1);
    }
    return count;
  }
}