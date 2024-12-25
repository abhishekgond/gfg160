class Solution {
  boolean twoSum(int arr[], int target) {
    // code here
    Set<Integer> al = new HashSet<>();
    for (int i : arr) {
      if (al.contains(target - i)) {
        return true;
      }
      al.add(i);
    }
    return false;
  }
}