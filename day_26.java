class Solution {
  static int minRemoval(int intervals[][]) {
      // code here
      Arrays.sort(intervals , (a,b)-> a[1]-b[1]);
      // using for sorting Element of index[1]
      int end = intervals[0][1],count =1;
      for(int i=1;i<intervals.length;i++){
          if(intervals[i][0]>=end){
              end = intervals[i][1];
              count++;
          }
      }
      return intervals.length-count;
  }
}
