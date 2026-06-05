class Solution {
    public int maximumDifference(int[] nums) {
        int leftmin=nums[0];
        int max=-1;
        for(int i=0;i<nums.length;i++){
            leftmin=Math.min(leftmin,nums[i]);
            if(leftmin<nums[i]){
                max=Math.max(max,nums[i]-leftmin);
            }
        }
        return max;
        
    }
}