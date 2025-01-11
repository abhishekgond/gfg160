class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int arr[] = new int[26];
        int i = 0, j = 0;
        int ans = 0;
        while (j < s.length()) {
            int ch = s.charAt(j) - 'a';
            if (arr[ch] > 0) {
                ans = Math.max(ans, j - i);
                while (i < j && s.charAt(i) != s.charAt(j)) {
                    arr[s.charAt(i) - 'a'] = 0;
                    i++;
                }
                i++;
            } else {
                arr[ch]++;
            }
            j++;
        }
        ans = Math.max(ans, j - i);
        return ans;

    }
}