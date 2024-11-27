class Solution {
  public int missingNumber(int[] arr) {
     // Your code here
     HashSet<Integer> set = new HashSet<>();
 for (int num : arr) {
     if (num > 0) {
         set.add(num);
     }
 }

int missing = 1;
 while (set.contains(missing)) {
     missing++;
 }
 
 return missing;
 }
}