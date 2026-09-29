class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3){
            return false;
        }
        boolean res = false;
        int f = Integer.MAX_VALUE;
        int s = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<f){
                f = nums[i];
                continue;
            }
            if(nums[i]<s){
                s = nums[i];
                continue;
            }
            if(nums[i]>f&&nums[i]>s){
                res = true;
            }
        }
        return res;
    }
}