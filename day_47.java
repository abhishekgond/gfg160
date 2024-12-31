class Solution {

  // Function to return length of longest subsequence of consecutive integers.
  public int longestConsecutive(int[] arr) {
    // code here
    Set<Integer> set = new HashSet<>();
    for (int i : arr) {
      set.add(i);
    }
    int max = 0;
    for (int i : arr) {
      int temp = i, curr = 0, temp2 = i - 1;
      if (set.contains(i)) {
        while (set.contains(temp)) {
          curr++;
          set.remove(temp);
          temp++;

        }
        while (set.contains(temp2)) {
          curr++;
          set.remove(temp2);
          temp2--;

        }
      }

      max = Math.max(max, curr);
    }
    return max;

  }
}