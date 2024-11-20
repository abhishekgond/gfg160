class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int x =( nums.length/3)+1;
        for(int val :  map.keySet()){
            if(map.get(val)>=x){
                al.add(val);
            }
        }
        return al;
    }
}