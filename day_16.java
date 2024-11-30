class Solution {
  // Function is to check whether two strings are anagram of each other or not.
  public static boolean areAnagrams(String s1, String s2) {
    // Your code here
    HashMap<Character, Integer> map = new HashMap<>();
    for (char c : s1.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    for (char ch : s2.toCharArray()) {
      if (map.containsKey(ch)) {
        map.put(ch, map.get(ch) - 1);
        if (map.get(ch) == 0) {
          map.remove(ch);
        }
      } else {
        return false;
      }
    }
    if (!map.isEmpty()) {
      return false;
    }
    return true;
  }
}