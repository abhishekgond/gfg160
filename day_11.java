class Solution {
  // Function to find maximum product subarray
  int maxProduct(int[] arr) {
      // code here
      int max =Integer.MIN_VALUE;
      int prefix = 1;
      for(int i=0;i<arr.length;i++){
          if(prefix==0){
              prefix =1;
          }
          prefix*=arr[i];
          max =Math.max(prefix,max);
      }
      int suffix = 1;
      for(int i=arr.length-1;i>=0;i--){
          if(suffix==0){
              suffix =1;
          }
          suffix*=arr[i];
          max =Math.max(suffix,max);
      }
      return max;
  }
}