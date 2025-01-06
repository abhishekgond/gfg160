class Solution {
  public List<Integer> sumClosest(int[] arr, int target) {
    // code here
    ArrayList<Integer> al = new ArrayList<>();
    Arrays.sort(arr);
    int i = 0, j = arr.length - 1;
    int curr = Integer.MAX_VALUE;
    while (i < j) {
      int x = arr[j] + arr[i];
      if (Math.abs(target - x) < curr) {
        curr = Math.abs(target - x);
        al.clear();
        al.add(arr[i]);
        al.add(arr[j]);
      }
      if (x < target) {
        i++;
      } else if (x > target) {
        j--;
      } else {
        return al;
      }
    }
    return al;
  }
}