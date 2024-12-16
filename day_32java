class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n = a.length,m=b.length;
        int count =0;
        int i=0,j=0;
        int ans = 0;
        while((i!=a.length) && j!=b.length){
            if(a[i]>b[j]){
                ans = b[j];
                j++;
                count++;
                if(count==k) return ans;
            }
            else {
               ans = a[i]; 
               i++;
                count++;
                if(count==k) return ans;
            }
        }
        
        while(i!=a.length){
            ans = a[i]; 
               i++;
                count++;
                if(count==k) return ans;
        }
        while(j!=b.length){
             ans = b[j];
                j++;
                count++;
                if(count==k) return ans;
        }
        
        return 0;
    }
}