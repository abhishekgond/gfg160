class Solution {
  static boolean find(char arr[][] ,int i,int j, int index ,String s,boolean [][]visit){
      if(index == s.length()) return true;
      if(i<0||j<0||i>=arr.length||j>=arr[0].length|| visit[i][j] || arr[i][j]!=s.charAt(index)) return false;
      visit[i][j] = true;
      if(find(arr,i,j-1,index+1,s,visit) ||
         find(arr, i,j+1,index+1,s,visit) ||
         find(arr, i+1,j,index+1,s,visit) ||
         find(arr, i-1,j,index+1,s,visit))
          return true;
      visit[i][j] = false;
      return false;
  }
  static public boolean isWordExist(char[][] mat, String s) {
      // Code here
      int n = mat.length;
      int m = mat[0].length;
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              if(mat[i][j]==s.charAt(0)){
                  boolean [][] visit = new boolean[n][m];
                  if(find(mat, i,j,0,s,visit)) return true;
              }
          }
      }
      return false;
  }
}