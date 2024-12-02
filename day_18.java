
class Solution {
  static void calculate(String pat, int arr[], int m) {
    int len = 0;
    arr[0] = 0;
    int i = 1;
    while (i < m) {
      if (pat.charAt(i) == pat.charAt(len)) {
        len++;
        arr[i] = len;
        i++;
      } else {
        if (len != 0) {
          len = arr[len - 1];
        } else {
          arr[i] = 0;
          i++;
        }
      }
    }
  }

  ArrayList<Integer> search(String pat, String txt) {
    // your code here
    int m = pat.length();
    int n = txt.length();
    ArrayList<Integer> al = new ArrayList<>();
    int arr[] = new int[m];
    calculate(pat, arr, m);
    int i = 0;
    int j = 0;
    int f = 0;
    while (i < n) {
      if (txt.charAt(i) == pat.charAt(j)) {
        i++;
        j++;
      }
      if (j == m) {
        f++;
        al.add(i - j);
        j = arr[j - 1];
      } else if (i < n && txt.charAt(i) != pat.charAt(j)) {
        if (j != 0) {
          j = arr[j - 1];
        } else {
          i++;
        }
      }
    }
    return al;
  }
}