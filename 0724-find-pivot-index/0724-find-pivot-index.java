class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int ind = 0;
        int left = 0;
        int total = 0;
        for(int num: nums){
            total+=num;
        }
        for(int j = 0;j<n;j++){
            if(total - left -nums[j]==left){
                return j;
            }
            left+=nums[j];
        }
        return -1;
    }
}