import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class day_1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}
class Solution {
  public int getSecondLargest(int[] arr) {
    // Code Here
    int n = arr.length;
    Arrays.sort(arr);
    int max = arr[n - 1];
    for (int i = n - 1; i >= 0; i--) {
      if (arr[i] != max) {
        return arr[i];
      }
    }
    return -1;
  }
}