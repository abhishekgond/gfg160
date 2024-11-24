class Solution {
    int maxSubarraySum(int[] arr) {
        int max =Integer.MIN_VALUE;
        int current = 0;
        for(int i=0;i<arr.length;i++){
            current+=arr[i];
            if(current>max){
                max =current;
            }
            if(current<0){
                current=0;
            }
        }
        return max;
    }
}