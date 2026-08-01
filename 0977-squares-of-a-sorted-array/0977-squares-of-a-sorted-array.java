class Solution {
    public int[] sortedSquares(int[] nums) {
        
        for(int i = 0;i<nums.length;i++){
            int tmp = 0;
            tmp = nums[i]*nums[i];
            nums[i] = tmp;
        }
        Arrays.sort(nums);
        return nums;
    }
}