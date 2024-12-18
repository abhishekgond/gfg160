

class Solution {

    public int peakElement(int[] arr) {
        // code here
        int lo= 1,hi =arr.length-2,mid =0;
        if(arr.length==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[arr.length-1]>arr[hi]) return arr.length-1;
        while(lo<=hi){
            mid = lo+(hi-lo)/2;
            if((arr[mid]>arr[mid-1]) && (arr[mid]>arr[mid+1])){
                return mid;
            }
            else if(arr[mid]>arr[mid-1]){
                lo = mid+1;
            }
            else{
                hi =mid-1;
            }
        }
        return 0;
    }
}