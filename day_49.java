class Solution {
  public int countSubarrays(int arr[], int k) {
    // code here
    int count = 0, currSum = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    for (int i : arr) {
      currSum += i;
      if (map.containsKey(currSum - k)) {
        count += map.get(currSum - k);
      }
      map.put(currSum, map.getOrDefault(currSum, 0) + 1);
    }
    return count;
  }
}