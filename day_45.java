class Solution {
  public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
    // code here
    Set<Integer> set = new HashSet<>();
    ArrayList<Integer> al = new ArrayList<>();
    for (int i = 0; i < a.length; i++) {
      set.add(a[i]);
    }
    for (int i = 0; i < b.length; i++) {
      if (set.contains(b[i])) {
        if (!al.contains(b[i])) {
          al.add(b[i]);
        }
      }
    }
    return al;
  }
}