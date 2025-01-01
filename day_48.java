class Solution {
  public ArrayList<ArrayList<String>> anagrams(String[] arr) {
      // code here
      ArrayList<ArrayList<String>> al = new ArrayList<>();
      HashMap<String , ArrayList<String>> map = new HashMap<>();
      for(int i=0;i<arr.length;i++){
          String s = arr[i];
          char ch[] = arr[i].toCharArray();
          Arrays.sort(ch);
          String str = new String(ch);
          if(!map.containsKey(str)){
              map.put(str,new ArrayList<>());
          }
          map.get(str).add(s);
      }
      for(ArrayList<String > al1 : map.values()){
          al.add(al1);
      }
      return al;
  }
}