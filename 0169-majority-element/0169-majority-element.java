class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>macha=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            macha.put(val,macha.getOrDefault(val,0)+1);
       }
       int ans=-1;
       int n=nums.length/2;
       for(int boom:macha.keySet()){
        if(macha.get(boom)>n){
            ans=boom;
            break;
        }
       }
       return ans;
    }
}