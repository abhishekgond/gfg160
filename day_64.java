class Solution {
  public static int[] productExceptSelf(int arr[]) {
      // code here
      int x = 1,count=0;
      int ans[] = new int[arr.length]; 
      for(int i=0;i<arr.length;i++){
          if(arr[i]!=0){
              x*=arr[i];
          }
          else{
              count++;
          }
      }
      if(count>1){
          return ans;
      }
      if(count==1){
          for(int i=0;i<arr.length;i++){
              if(arr[i]==0){
                  ans[i]=x;
              }
          }
          return ans;
      }
      for(int i=0;i<arr.length;i++){
              ans[i]=x/arr[i];
      }
      return ans;
  }
}