class Solution {

  static ArrayList<Integer> subarraySum(int[] arr, int target) {
    // code here

    ArrayList<Integer> al = new ArrayList<>();
    int n = arr.length, j = 0, sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      while (sum > target && j < i)
        sum -= arr[j++];
      if (sum == target) {
        al.add(j + 1);
        al.add(i + 1);
        return al;
      }
    }
    al.add(-1);
    return al;

  }

}