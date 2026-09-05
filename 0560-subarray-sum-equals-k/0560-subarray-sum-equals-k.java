class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer>map=new HashMap<>();
       int psum=0;int count=0;
       map.put(0,1);
       for(int n:nums){
        psum=psum+n;
        int target=psum-k;
        if(map.containsKey(target)){
            count+=map.get(target);
        } 
         map.put(psum,map.getOrDefault(psum,0)+1);
       }
       return count;
    }
}