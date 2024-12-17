class Solution {
  static boolean isPosible(int arr[],int dist,int k){
      int cow_count = 1,last = arr[0];
      
      for(int i=1;i<arr.length;i++){
          if(arr[i]-last>=dist){
              cow_count++;
              last=arr[i];}}
      if(cow_count>=k) return true;
      return false;}
  public static int aggressiveCows(int[] stalls, int k) {
      // code here
      Arrays.sort(stalls);
      int lo = 0,hi=stalls[stalls.length-1]-stalls[0],mid=0;
      while(lo<=hi){
          mid = lo+(hi-lo)/2;
          if(isPosible(stalls,mid,k)==true)lo = mid+1;
          else hi=mid-1;
      }
      if(hi==-1) return 0;
      
      return hi;
  }
}