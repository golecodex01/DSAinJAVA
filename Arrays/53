class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum=nums[0];
        int maxSum=nums[0];
        for(int i =1;i<nums.length;i++){
             currentsum=nums[i]+currentsum;
             if(currentsum<nums[i]){
                currentsum=nums[i];
             }
             if(currentsum>maxSum){
                maxSum=currentsum;
             }
        }
        return maxSum ;
    }
}
