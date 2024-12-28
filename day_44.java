class Solution {
  public List<List<Integer>> findTriplets(int[] arr) {
    Set<List<Integer>> set = new HashSet<>();
    HashMap<Integer, List<int[]>> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        int sum = arr[i] + arr[j];
        if (!map.containsKey(sum))
          map.put(sum, new ArrayList<>());
        map.get(sum).add(new int[] { i, j });
      }
    }
    for (int i = 0; i < arr.length; i++) {
      int target = -arr[i];
      if (map.containsKey(target)) {
        List<int[]> pair = map.get(target);
        for (int[] p : pair) {
          if (p[0] != i && p[1] != i) {
            List<Integer> curr = Arrays.asList(i, p[0], p[1]);
            Collections.sort(curr);
            set.add(curr);
          }

        }
      }
    }
    return new ArrayList<>(set);
  }
}