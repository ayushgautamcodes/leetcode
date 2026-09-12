class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        int count = 1;
        for(int i = n-1;i>=0;i--){
            if(count==k){
                ans = nums[i];
                break;
            }else{
                count++;
            }
        }
        return ans;
    }
}