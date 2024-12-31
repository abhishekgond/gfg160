class Solution {
  public static int findUnion(int a[], int b[]) {
    // code here
    Set<Integer> set = new HashSet<>();
    for (int i : a) {
      set.add(i);
    }
    for (int i : b) {
      if (!set.contains(i)) {
        set.add(i);
      }
    }
    return set.size();
  }
}